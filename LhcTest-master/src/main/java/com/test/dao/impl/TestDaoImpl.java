package com.test.dao.impl;

import com.test.dao.TestDao;
import org.apache.ibatis.jdbc.SQL;

/**
 * \* Created: liuhuichao
 * \* Date: 2021/4/18
 * \* Time: 10:08 上午
 * \* Description:
 * \
 */
public class TestDaoImpl {
    /*public String getAllGoodsListSQL() {
        return new SQL() {
            {
                SELECT("id,name,(SELECT gtype.NAME FROM goodstype gtype WHERE gtype.id = Type) as typeName, price, Number as number,DATE_FORMAT(createdon,'%Y-%m-%d %h:%i:%s') as createdon,DATE_FORMAT(modifiedon,'%Y-%m-%d %h:%i:%s') as modifiedon");
                FROM("goods");
            }
        }.toString();
    }*/
}
