package com.jackie.smartapi.controller;

import com.jackie.smartapi.Model.Project;
import com.jackie.smartapi.dao.ProjectDAO;
import net.sf.json.JSONArray;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    static ApplicationContext ctx;

    static {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

/*    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST, headers = "Content-Type=application/json")
    public String insertProject(HttpServletRequest request, HttpServletResponse response) throws IOException {

        InputStream is = request.getInputStream();
        byte bytes[] = new byte[request.getContentLength()];
        is.read(bytes);
        String jsonStr = new String(bytes, request.getCharacterEncoding());
        // projectDAO.createProject(new Project());
        return "create success";

    }*/

    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String insertProject(@ModelAttribute("project") Project project) throws IOException {

        ProjectDAO projectDAO = (ProjectDAO) ctx.getBean("projectDAO");
        projectDAO.createProject(project);
        return "create success";

    }

    @ResponseBody
    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public String getAll(ServletResponse res) {

     /*   HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");*/

        ProjectDAO projectDAO = (ProjectDAO) ctx.getBean("projectDAO");
        List<Map<String, Object>> resList = projectDAO.getAllProject();
        return JSONArray.fromObject(resList).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getProject() {
        return "create success";
    }


}

