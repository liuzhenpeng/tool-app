package com.example.tool.application;

import com.example.tool.BaseTest;
import com.example.tool.application.biz.service.ServiceA;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Service extends BaseTest {

    @Autowired
    ServiceA serviceA;

    @Test
    public void test1(){
        serviceA.print();
        System.out.println("OK");
    }

}
