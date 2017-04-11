package com.jackie.smartapi.Model.mapper;

import com.jackie.smartapi.Model.Project;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by luhaiming on 2017/4/11 0011.
 */
public class ProjectMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Project project = new Project();
        project.setId(rs.getInt("id"));
        project.setName(rs.getString("name"));
        project.setCreator(rs.getString("creator"));
        project.setCreatetime(rs.getString("createtime"));
        project.setNote(rs.getString("note"));
        return project;
    }
}
