package com.Lovienails.LovieNails.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping
    public String hello(){
        return "home";
    }

}

//<hr> this tag is used to define a thematic break in html. Ofter displayed as a horizontal
// rule that used to separate content(or define a change) in an html page
