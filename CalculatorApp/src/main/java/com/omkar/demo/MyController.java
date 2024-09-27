package com.omkar.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyController {

    @RequestMapping("m")
    public static String myMethod(){
        return "<h1>Omkar First Project<h1>";
    }

    @PostMapping("process-form")
    public static String getData(@RequestParam int num1,@RequestParam int num2){
       int res = num1 + num2;
       return String.valueOf(res);
       // return "result= " +res;
    }
    
}
