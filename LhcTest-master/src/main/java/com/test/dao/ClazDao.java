package com.test.dao;

import com.test.dao.impl.ClazDaoImpl;
import com.test.entity.Claz;
import org.apache.ibatis.annotations.SelectProvider;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface ClazDao {
    /**
     * 获取全部班级
     * @return
     */
    @SelectProvider(type = ClazDaoImpl.class, method = "getAllClaz")
    List<Claz> getAllClaz();

}
