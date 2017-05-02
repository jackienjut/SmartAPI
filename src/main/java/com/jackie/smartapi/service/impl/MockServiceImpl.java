package com.jackie.smartapi.service.impl;

import com.jackie.smartapi.service.MockService;
import org.springframework.stereotype.Service;

/**
 * Created by luhaiming on 2017/5/2 0002.
 */
@Service("mockService")
public class MockServiceImpl implements MockService {
    @Override
    public String mockData() {
        return null;
    }
}
