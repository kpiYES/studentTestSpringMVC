package com.studentTestSpringMVC.service;

import com.studentTestSpringMVC.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    void update(User user);

    void remove(Long id);

    User findById(Long id);

    List<User> findAll();

}
