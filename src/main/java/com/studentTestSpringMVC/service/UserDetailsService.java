package com.studentTestSpringMVC.service;

public interface UserDetailsService {

    User logIn(String email, String password);
}
