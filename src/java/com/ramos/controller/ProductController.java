/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramos.controller;

import com.ramos.model.ProductBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping()
    public String seeOurProduct(Model model) {
        ProductBean prodBean = new ProductBean();
        model.addAttribute("product", prodBean);
        return "product";

    }

}
