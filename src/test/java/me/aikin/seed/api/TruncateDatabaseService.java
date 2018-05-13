package me.aikin.seed.api;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Service
@Profile("test")
public class TruncateDatabaseService {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Value(value = "${spring.datasource.name}")
    private String DatabaseName;


    void truncate() throws SQLException {
        try (final SqlSession sqlSession = sqlSessionFactory.openSession()) {
            Connection sqlSessionConnection = sqlSession.getConnection();
            sqlSessionConnection.prepareStatement("SET FOREIGN_KEY_CHECKS = FALSE;").execute();

            String tableNameColumn = "table_name";
            String queryString = "SELECT %s FROM information_schema.tables WHERE table_type = 'base table' AND table_schema = '%s'";
            String queryAllTableNamesStatement = String.format(queryString, tableNameColumn, DatabaseName);

            ResultSet resultSet = sqlSessionConnection.prepareStatement(queryAllTableNamesStatement).executeQuery();
            ArrayList<String> tableNames1 = new ArrayList<>();
            while (resultSet.next()) {
                String tableName1 = resultSet.getString(tableNameColumn);
                tableNames1.add(tableName1);
            }
            ArrayList<String> tableNames = tableNames1;
            tableNames.forEach(tableName -> {
                try {
                    PreparedStatement preparedStatement = sqlSessionConnection.prepareStatement("TRUNCATE TABLE " + tableName + ";");
                    preparedStatement.setQueryTimeout(20);
                    preparedStatement.execute();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            });

            sqlSessionConnection.prepareStatement("SET FOREIGN_KEY_CHECKS = TRUE;").execute();

            sqlSession.commit(true);
        }
    }

}
