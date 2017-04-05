package com.jackie.smartapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping(value = "/test")
    public String test1(HttpServletResponse response) throws IOException {
        return "test";
    }

    @ResponseBody
    @RequestMapping(value = "/test1")
    public String test2(HttpServletResponse response) throws IOException {
        return "test1";
    }
}
