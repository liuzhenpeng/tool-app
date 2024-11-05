package com.example.tool.application.biz.controller;

import com.example.tool.application.biz.service.ServiceA;
import com.example.tool.basic.common.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    ServiceA serviceA;
    @Autowired
    ServiceB serviceB;

    @GetMapping("/message")
    public String message() {

        serviceA.print();
        serviceB.print();
        return "OK";
    }


}
