package com.audio.account.services;

import com.audio.account.models.entity.User;
import com.audio.account.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User login(User user) throws Exception {
        User u = userRepository.findByEmail(user.getEmail());
        if (user.getPassword().equals(u.getPassword())) return u;
        else return null;
    }
}
