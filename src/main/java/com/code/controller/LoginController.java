package com.code.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @RequestMapping(value = "/login/{id}", method = RequestMethod.GET)
    public String login(@PathVariable String id, HttpSession httpSession){
        httpSession.setAttribute("id", id);
        return httpSession.getId()+":"+httpSession.getAttribute("id");
    }
}
