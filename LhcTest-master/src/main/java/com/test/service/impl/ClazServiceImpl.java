package com.test.service.impl;

import com.test.dao.ClazDao;
import com.test.entity.Claz;
import com.test.service.ClazService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazServiceImpl implements ClazService {
    @Autowired
    private ClazDao clazDao;


    @Override
    public List<Claz> getAllClaz() {
        return clazDao.getAllClaz();
    }
}
