package com.test.dao.impl;

import org.apache.ibatis.jdbc.SQL;

import static org.apache.ibatis.mapping.SqlCommandType.SELECT;

public class ClazDaoImpl {
    public String getAllClaz() {
        return new SQL() {
            {
                SELECT("id,name,level");
                FROM("claz");
            }
        }.toString();
    }
}
