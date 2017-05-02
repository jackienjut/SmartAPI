package com.jackie.smartapi.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
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


    @RequestMapping(method = RequestMethod.GET, value = "/test1/{name}")
    @ResponseBody
    public String sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
        return "aaa" + name;
    }


}
