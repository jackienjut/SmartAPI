package com.jackie.smartapi.service.impl;

import com.jackie.smartapi.Model.Interface;
import com.jackie.smartapi.dao.InterfaceDAO;
import com.jackie.smartapi.service.InterfaceService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by luhaiming on 2017/4/28 0028.
 */
public class InterfaceServiceImpl implements InterfaceService {
    @Resource
    private InterfaceDAO interfaceDAO;

    @Override
    public List<Interface> showInterface(int project_id) {
        List<Map<String, Object>> list = interfaceDAO.getAllInterface(project_id, 0);
        return null;

    }
}
