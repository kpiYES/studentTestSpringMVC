package com.studentTestSpringMVC.service.impl;

import com.studentTestSpringMVC.model.User;
import com.studentTestSpringMVC.repository.UserRepository;
import com.studentTestSpringMVC.repository.impl.UserRepositoryImpl;
import com.studentTestSpringMVC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(User user) {
        userRepository.add(user);
    }

    public void update(User user) {
        userRepository.update(user);
    }

    public void remove(Long id) {
        userRepository.remove(id);
    }

    public User findById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
