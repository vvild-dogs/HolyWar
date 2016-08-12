package com.holy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/login")
public class Login {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView login(){
        return new ModelAndView("sign");
    }
}
