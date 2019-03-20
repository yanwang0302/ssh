package com.ssh.service.impl;

import com.ssh.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author Evim
 * @date 2019/3/1419:30
 **/
@Service
public class TestServiceImpl implements TestService {

    public String test() {
        return "test";
    }
}
