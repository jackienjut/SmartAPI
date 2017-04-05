package com.jackie.smartapi.controller;

import com.jackie.smartapi.Model.Project;
import com.jackie.smartapi.dao.ProjectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

/**
 * Created by luhaiming on 2017/3/23 0023.
 */
@Controller
public class ProjectController {

    @Autowired
    public ProjectDAO projectDAO;

    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST, headers = "Content-Type=application/json")
    public String insertProject(HttpServletRequest request, HttpServletResponse response) throws IOException {
        InputStream is = request.getInputStream();
        byte bytes[] = new byte[request.getContentLength()];
        is.read(bytes);
        String jsonStr = new String(bytes, request.getCharacterEncoding());
        projectDAO.createProject(new Project());
        return "create success";
    }

    @ResponseBody
    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public String getAll() {

        return "create success";
    }

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getProject() {
        return "create success";
    }
}

