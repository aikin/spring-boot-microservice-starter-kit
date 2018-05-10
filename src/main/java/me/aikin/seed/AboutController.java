package me.aikin.seed;

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

    @GetMapping
    public String about() {
        return userService.about();
    }
}
