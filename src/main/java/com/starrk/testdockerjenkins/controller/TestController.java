package com.starrk.testdockerjenkins.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("hello/{name}")
    public String hello(@PathVariable(value = "name") String name) {
        return "hello:" + name;
    }
}
