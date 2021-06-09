package com.soham.petclinicspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/Vets","/vets","/VETS","/Vets/","/vets/","/VETS/","/Vets/index","/vets/index","/VETS/index"})
    public String listVets(){

        return "vets/index";
    }
}
