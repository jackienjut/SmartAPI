package com.jackie.smartapi.dao.impl;

import com.jackie.smartapi.Model.Project;
import com.jackie.smartapi.dao.ProjectDAO;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by luhaiming on 2017/3/23 0023.
 */
public class ProjectImpl implements ProjectDAO {

    private JdbcTemplate jdbcTemplate;

    @Override
    public String createProject(Project project) {
        String sql = "INSERT INTO project" +
                "( name , creator ,createtime , note)" +
                "VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{
                project.getName(), project.getCreator(), project.getCreatetime(), project.getNote()
        });

        return "success";
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
