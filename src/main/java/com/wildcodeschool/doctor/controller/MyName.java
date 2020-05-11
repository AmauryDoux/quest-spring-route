package com.wildcodeschool.doctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyName {

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable String name) {

        return "Hello " + name;
    }
    /*
    @GetMapping("/movie")
    @ResponseBody
    public String showTitle(@RequestParam String title) {

        return "The movie's title is " + title;
    }
    */
    @GetMapping("/movie")
    @ResponseBody
    public String showTitle(@RequestParam String title, @RequestParam(defaultValue = "", required = false) String year) {
        if (!year.isEmpty()) {
            return "The movie's title is " + title + " (" + year + ")";
        }
        return "The movie's title is " + title;
    }
}
