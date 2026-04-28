package com.back.jsbtutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping
    void index(){
        System.out.println("index");
    }

    @GetMapping("/hello")
    void hello(){
        System.out.println("hello");
    }
}
