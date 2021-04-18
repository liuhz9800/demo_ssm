package com.test.service.impl;

import com.test.dao.TestDao;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * \* Created: liuhuichao
 * \* Date: 2021/4/18
 * \* Time: 10:06 上午
 * \* Description:
 * \
 */

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;
}
