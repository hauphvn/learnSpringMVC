package com.coderzero.controller;

import com.coderzero.model.Fresher;
import com.coderzero.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
//    String 2.0
//    @RequestMapping("login")
//    public ModelAndView showLogin(){
//        ModelAndView mav = new ModelAndView("login");
//        Fresher fresher = new Fresher();
//        fresher.setName("Pham vn hau");
//        fresher.setUsername("hauphvn");
//        fresher.setPassword("123456");
//        mav.addObject("fresher", fresher);
//        return mav;
//    }

//    String 3.0
        @RequestMapping("login")
    public String showLogin(Model model){
        Fresher fresher = new Fresher();
        fresher.setName("Pham vn hau");
        fresher.setUsername("hauphvn");
        fresher.setPassword("123456");
        model.addAttribute("fresher", fresher);
        return "login";
    }

    @RequestMapping("dashboard")
    public String login(@ModelAttribute("fresher") Fresher fresher, Model model){
            if(loginService.login(fresher)){
                model.addAttribute("fresher", fresher);
                return "dashboard";
            }
            model.addAttribute("error", true);
            return "redirect:login";

    }
}

