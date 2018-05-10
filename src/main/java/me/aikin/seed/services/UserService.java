package me.aikin.seed.services;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String about() {
        return "spring boot best seed.";
    }
}
