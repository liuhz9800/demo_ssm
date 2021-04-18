package com.test.dao;

import com.test.dao.impl.ClazDaoImpl;
import com.test.entity.Claz;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

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

    /**
     * 根据id获取班级
     * @param id
     * @return
     */
    @SelectProvider(type = ClazDaoImpl.class, method = "getClaz")
    Claz getClaz(final int id);

    /**
     * 根据id删除班级
     * @param id
     * @return
     */
    @DeleteProvider(type = ClazDaoImpl.class, method = "deleteClaz")
    int deleteClaz(final int id);

    /**
     * 根据id修改班级名称
     * @param name
     * @param id
     * @return
     */
    @UpdateProvider(type = ClazDaoImpl.class, method = "updateClaz")
    int  updateClaz(final String name,final int id);

    /**
     * 添加新班级
     * @param id
     * @param name
     * @param level
     * @return
     */
    @InsertProvider(type = ClazDaoImpl.class, method = "insertClaz")
    int insertClaz(final int id,final String name,final int level);
}