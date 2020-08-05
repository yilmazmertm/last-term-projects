package com.yilmazmertm.controller;

import com.yilmazmertm.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private CustomerService customerService;
    @RequestMapping({"/", ""})
    public String showHome(){
        return "hello";
    }
}
