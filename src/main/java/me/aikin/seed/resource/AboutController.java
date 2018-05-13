package me.aikin.seed.resource;

import me.aikin.seed.services.AboutService;
import me.aikin.seed.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/about")
public class AboutController {

    @Autowired
    private UserService userService;

    @Autowired
    private AboutService aboutService;

    @GetMapping
    public String aboutUser() {
        return userService.getUserName() + ": " + aboutService.about() + ".";
    }
}
