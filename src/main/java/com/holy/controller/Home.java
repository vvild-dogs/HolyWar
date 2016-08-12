package com.holy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class Home {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView homePageRender(){
        return new ModelAndView("home");
    }
}
