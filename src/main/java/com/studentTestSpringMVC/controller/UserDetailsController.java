package com.studentTestSpringMVC.controller;

import com.studentTestSpringMVC.repository.UserRepository;
import com.studentTestSpringMVC.service.UserDetailsService;
import com.studentTestSpringMVC.service.UserService;
import com.studentTestSpringMVC.service.impl.UserDetailsServiceImpl;
import com.studentTestSpringMVC.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class UserDetailsController {

    //    private UserDetailsService userDetailsService;

    private UserDetailsService userDetailsService;

    @Autowired
    private ApplicationContext applicationContext;

//    @Autowired
//    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    public UserDetailsController(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @PostMapping
    public ModelAndView login() {
        userDetailsService.logIn();
//        System.out.println(applicationContext.getBeansOfType(UserDetailsService.class).isEmpty());
//        System.out.println(applicationContext.getBeansOfType(UserDetailsServiceImpl.class).isEmpty());

        String[] strings = applicationContext.getBeanDefinitionNames();
        for (String s : strings) {
            System.out.println(s);
        }

//        System.out.println("login");
//        System.out.println(userService.findAll());
        return new ModelAndView("login");
    }
}

