package com.soham.petclinicspringboot.controller;

import com.soham.petclinicspringboot.services.OwnerService;
import com.soham.petclinicspringboot.services.map.OwnerServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerServiceMap ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners","/owners/","/owners/index","/owners/index.html"})
    public String listOwner(Model model){

        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }
}
