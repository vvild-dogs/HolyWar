package com.holy.controller;

import com.holy.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/register")
public class Registration {

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView registerPageRender(){
        return new ModelAndView("registration");
    }

    @RequestMapping(value = "/userMeta", method = RequestMethod.POST)
    public ModelAndView getUserMetaForRegistration(@RequestParam(value = "userName") String userName,
                                                   @RequestParam(value = "password") String password)
            throws NoSuchAlgorithmException {
        String role = "USER";
        registrationService.getUserMetaForRegistration(userName, shaPasswordDecoder(password), role);
        return registerPageRender();
    }

    private String shaPasswordDecoder(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }
}
