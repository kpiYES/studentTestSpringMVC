package com.studentTestSpringMVC.service.impl;

import com.studentTestSpringMVC.model.User;
import com.studentTestSpringMVC.repository.UserRepository;
import com.studentTestSpringMVC.service.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void logIn() {

        System.out.println(userRepository.findById(1L));
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBB");
        System.out.println(userRepository.findAll());

    }
}
