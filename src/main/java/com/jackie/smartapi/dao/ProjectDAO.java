package com.jackie.smartapi.dao;

import com.jackie.smartapi.Model.Project;

import java.util.List;
import java.util.Map;

/**
 * Created by luhaiming on 2017/3/23 0023.
 */
public interface ProjectDAO {
    public String createProject(Project project);

    public List<Map<String, Object>> getAllProject();
}
