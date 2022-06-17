package com.udemy.rest.webservices.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired 
    HelloObj obj;

    @GetMapping("/hello")
    public String hello(){
        return("hello world");
    }

    @GetMapping("/hello-object")
    public HelloObj helloObj(@PathVariable String s, @RequestParam("i") int i){
        obj.setI(i);
        obj.setS(s);
        return obj;
    } 
}
