package com.oms.auth0.security.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import java.security.Principal;
import java.util.Map;

@SuppressWarnings("unused")
@RestController
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/portal/home", method = RequestMethod.GET)
    protected String home(final Principal principal) {
        logger.info("Home page");
        if (principal == null) {
            return "redirect:/logout";
        }
        return "Hi You are successfylly logged in";
    }

}
