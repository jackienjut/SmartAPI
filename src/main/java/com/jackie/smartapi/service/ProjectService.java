package com.jackie.smartapi.service;

import com.jackie.smartapi.Model.Project;

import java.util.List;
import java.util.Map;

/**
 * Created by luhaiming on 2017/4/28 0028.
 */
public interface ProjectService {

    public String createProject(Project project);

    public Project getProject(int project_id);

    public List<Map<String, Object>> getProjects();
}
