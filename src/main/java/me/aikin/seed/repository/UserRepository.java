package me.aikin.seed.repository;

import me.aikin.seed.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserRepository {
    @Select("SELECT * FROM user WHERE id = #{userId}")
    User findOne(Integer userId);
}
