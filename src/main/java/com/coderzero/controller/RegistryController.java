package com.coderzero.controller;

import com.coderzero.model.Fresher;
import com.coderzero.service.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistryController {
    @Autowired
    private RegistryService registryService;
    @RequestMapping("registry")
    public String showRegistry(@ModelAttribute("fresher") Fresher fresher){
        return "registry";
    }

    @RequestMapping("userRegistry")
    public String registry(@ModelAttribute("fresher") Fresher fresher, Model model){
        if(registryService.registry(fresher)){
            return "redirect:login";
        }
        return "redirect:registry";
    }
}
