package com.holy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/register")
public class Registration {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView registerPageRender(){
        return new ModelAndView("registration");
    }
}
