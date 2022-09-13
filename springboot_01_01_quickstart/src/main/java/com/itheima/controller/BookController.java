package com.itheima.controller;

//Rest模式

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping
    public String getById(){
        System.out.println("spring boot is running...");

        return "spring boot is running...";
    }

}
