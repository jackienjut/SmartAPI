package com.jackie.smartapi.controller;

import com.jackie.smartapi.Model.Interface;
import com.jackie.smartapi.dao.InterfaceDAO;
import com.jackie.smartapi.service.InterfaceService;
import net.sf.json.JSONArray;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by luhaiming on 2017/3/23 0023.
 */
@Controller
@RequestMapping(value = "/interface")
public class InterfaceController {

    @Resource
    private InterfaceService interfaceService;

    @ResponseBody
    @RequestMapping(value = "/getschemes", method = RequestMethod.GET)
    public String getSchemes() {

        List<String> list = new ArrayList<>();
        list.add("http");
        list.add("https");

        return JSONArray.fromObject(list).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/getALlInterface/{projectid}/{moduleid}", method = RequestMethod.GET)
    public String getAllInterface( @PathVariable("projectid") int project_id, @PathVariable("moduleid") int module_id) {

        List<Map<String, Object>> resList = interfaceService.showInterface(project_id);
        return JSONArray.fromObject(resList).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getProject() {
        return "create success";
    }


}

