/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramos.controller;

import com.ramos.model.LoginFormBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping()
    public String goToLogin(Model model){
        LoginFormBean loginBean = new LoginFormBean();
        model.addAttribute("login",loginBean);
        return "login";
    }
}
