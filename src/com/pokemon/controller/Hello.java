package com.pokemon.controller;


import com.pokemon.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created by Administrator on 2017/4/21 0021.
 */
@Controller
public class Hello {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String hello(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user, ModelMap model) {
        model.addAttribute("name", user.getName());
        model.addAttribute("password", user.getPassword());
        return "login";
    }
}
