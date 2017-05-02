package com.jackie.smartapi.service.impl;

import com.jackie.smartapi.Model.Project;
import com.jackie.smartapi.dao.ProjectDAO;
import com.jackie.smartapi.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by luhaiming on 2017/4/28 0028.
 */
@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

    @Resource
    private ProjectDAO projectDAO;

    @Override
    public String createProject(Project project) {
        projectDAO.createProject(project);
        return "success";
    }

    @Override
    public Project getProject(int project_id) {
        return null;
    }

    @Override
    public List<Map<String, Object>> getProjects() {
        return projectDAO.getAllProject();
    }
}
