package com.audio.account.controllers;

import com.audio.account.models.entity.User;
import com.audio.account.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public User login(@RequestBody User user) throws Exception {
        if (user == null || user.getPassword().length() < 1)
            return null;
        return userService.login(user);
    }
}
