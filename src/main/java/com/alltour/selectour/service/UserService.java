package com.alltour.selectour.service;

import com.alltour.selectour.model.User;
import com.alltour.selectour.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
