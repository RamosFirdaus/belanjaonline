/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramos.controller;

import com.ramos.model.RegisterFormBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

    @RequestMapping()
    public String registerForm(Model model) {
        RegisterFormBean registerBean = new RegisterFormBean();
        model.addAttribute("registerBean", registerBean);
        return "register";
    }
}
