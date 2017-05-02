package com.jackie.smartapi.dao;

import com.jackie.smartapi.Model.Interface;

import java.util.List;
import java.util.Map;

/**
 * Created by luhaiming on 2017/4/25 0025.
 */
public interface InterfaceDAO {

    public String createInteraface(Interface interfaceMO);

    public List<Map<String, Object>> getAllInterface(int project_id, int module_id);
}
