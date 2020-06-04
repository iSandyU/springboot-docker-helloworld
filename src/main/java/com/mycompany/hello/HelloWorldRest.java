package com.mycompany.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldRest {
    
    @RequestMapping("/hello")
    public String sayHello()
    {
        return "Saying Hello!!" ;
    }

}