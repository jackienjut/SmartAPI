package com.jackie.smartapi.controller;

import com.jackie.smartapi.service.MockService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by luhaiming on 2017/4/28 0028.
 */
@Controller
@RequestMapping(value = "/mock")
public class MockController {

    @Resource
    private MockService mockService;


    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getSchemes() {
        return "this is a simple test";
    }

    @ResponseBody
    @RequestMapping(value = "/mockdata", method = RequestMethod.POST)
    public String mockData() {

        return "Mock test data unfinished";
    }

}
