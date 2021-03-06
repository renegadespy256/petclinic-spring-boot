package com.soham.petclinicspringboot.controller;

import com.soham.petclinicspringboot.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/Vets","/vets","/VETS","/Vets/","/vets/","/VETS/","/Vets/index","/vets/index","/VETS/index","/vets.html"})
    public String listVets(Model model){
        model.addAttribute("vets",vetService.findAll());

        return "vets/index";
    }
}
