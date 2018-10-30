package com.studentTestSpringMVC.controller;

import com.studentTestSpringMVC.service.UserDetailsService;
import com.studentTestSpringMVC.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class UserDetailsController {

    private UserDetailsService userDetailsService;

    @Autowired
    UserDetailsController(UserDetailsService userDetailsService){
        this.userDetailsService = userDetailsService;
    }

    @PostMapping
    public ModelAndView login() {
userDetailsService



        return new ModelAndView("login");
    }
}

