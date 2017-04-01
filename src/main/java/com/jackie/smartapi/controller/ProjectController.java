package com.jackie.smartapi.controller;

import com.jackie.smartapi.dao.ProjectDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by luhaiming on 2017/3/23 0023.
 */
@Controller
@RequestMapping("/project")
public class ProjectController {

    public ProjectDAO projectDAO;

    @ResponseBody
    @RequestMapping("/create")
    public String insertProject(HttpServletRequest request, HttpServletResponse response) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        projectDAO = (ProjectDAO) ctx.getBean("stockDAO");

        return "create success";

    }

}
