package com.soham.petclinicspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners","/owners/","/owners/index","/owners/index.html"})
    public String listOwner(){

        return "owners/index";
    }
}
