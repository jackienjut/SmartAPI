package com.jackie.smartapi.controller;

import com.jackie.smartapi.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by luhaiming on 2017/4/28 0028.
 */
@Controller
@RequestMapping(value = "/auto")
public class AutowiredDemoController {

    @Resource
    private ProjectService projectService;

    @ResponseBody
    @RequestMapping(value = "/test")
    public String test() {
        List<Map<String, Object>> list = projectService.getProjects();
        return "list";
    }
}
