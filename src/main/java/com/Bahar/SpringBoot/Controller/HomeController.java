package com.Bahar.SpringBoot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

@RequestMapping("/")
    public String homeController(){

    return "Das Boot, Reporting for duty!" ;
}

}
