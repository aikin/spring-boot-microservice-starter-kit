package me.aikin.seed.component;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import com.jayway.restassured.module.mockmvc.specification.MockMvcRequestSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public abstract class ApiBaseTest<T> {

    @BeforeEach
    public void setUp() {
        StandaloneMockMvcBuilder mvcBuilder = MockMvcBuilders.standaloneSetup(getApi());
        RestAssuredMockMvc.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssuredMockMvc.mockMvc(mvcBuilder.build());
    }

    protected abstract T getApi();

    public MockMvcRequestSpecification given() {
        return RestAssuredMockMvc
            .given()
            .header("Accept", ContentType.JSON.withCharset("UTF-8"))
            .header("Content-Type", ContentType.JSON.withCharset("UTF-8"));
    }
}
