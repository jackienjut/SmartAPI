package com.jackie.smartapi.dao.impl;

import com.jackie.smartapi.Model.InterfaceMO;
import com.jackie.smartapi.dao.InterfaceDAO;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * Created by luhaiming on 2017/4/24 0024.
 */
public class InterfaceImpl implements InterfaceDAO {

    private JdbcTemplate jdbcTemplate;

    @Override
    public String createInteraface(InterfaceMO interfaceMO) {
        try {
            String sql = "INSERT INTO interface ( project_id , module_id,scheme ,host,method,parameters ,header , notes) VALUES (?, ?, ?, ?,?, ?, ?, ?)";

            jdbcTemplate.update(sql, new Object[]{
                    interfaceMO.getProject_id(), interfaceMO.getModule_id(), interfaceMO.getScheme(), interfaceMO.getHost(), interfaceMO.getMethod(), interfaceMO.getParameters(), interfaceMO.getHeader(), interfaceMO.getNotes()
            });
        } catch (Exception e) {

        } finally {
            return "success";
        }
     }

    @Override
    public List<Map<String, Object>> getAllInterface(int project_id, int module_id) {
        String sql = "SELECT * FROM smart.interface;";
        return jdbcTemplate.queryForList(sql);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
