package com.pokemon.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/4/21 0021.
 */
@Controller
public class Hello {
    @RequestMapping(value = "/hello")
    public String hello(Model model){
        model.addAttribute("Title", "Welcome");
        model.addAttribute("END", "Welcome to our project");
        return "index";
    }
}
