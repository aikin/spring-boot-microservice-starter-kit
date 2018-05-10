package me.aikin.seed.component;


import me.aikin.seed.AboutController;
import me.aikin.seed.services.AboutService;
import me.aikin.seed.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.hamcrest.Matchers.equalTo;

@ContextConfiguration(
    classes = {
        AboutService.class,
        UserService.class,
        AboutController.class
    })
public class AboutControllerTest extends ApiBaseTest<AboutController> {

    @Autowired
    private AboutController aboutController;

    @Override
    protected AboutController getApi() {
        return aboutController;
    }

    @Test
    public void should_return_correct_content_when_get_about() {
        given().

        when().
                get("/api/about").
        then().
                body(equalTo("aikin: about."));
    }
}
