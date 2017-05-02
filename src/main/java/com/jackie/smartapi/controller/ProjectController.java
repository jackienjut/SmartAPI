package com.jackie.smartapi.controller;

import com.jackie.smartapi.Model.Project;
import com.jackie.smartapi.dao.ProjectDAO;
import com.jackie.smartapi.service.ProjectService;
import net.sf.json.JSONArray;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by luhaiming on 2017/3/23 0023.
 */

@Controller
@RequestMapping(value = "/project")
public class ProjectController {

    @Resource
    private ProjectService projectService;

    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String insertProject(@ModelAttribute("project") Project project) throws IOException {
        projectService.createProject(project);
        return "create success";
    }

    @ResponseBody
    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public String getAll() {

        List<Map<String, Object>> resList = projectService.getProjects();
        return JSONArray.fromObject(resList).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getProject() {
        return "create success";
    }


}

