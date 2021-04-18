package com.test.dao.impl;

import net.sf.jsqlparser.statement.select.Select;
import org.apache.ibatis.jdbc.SQL;
import org.opensaml.ws.wsaddressing.From;

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

    public String getClaz(final int id) {
        return new SQL() {{
            SELECT("id,name,level");
            FROM("claz");
            WHERE("id=${id}");
        }}.toString();
    }

    public String deleteClaz(final int id) {
        return new SQL() {{
            DELETE_FROM("claz");
            WHERE("id=${id}");
        }}.toString();
    }

    public String updateClaz(final String name, final int id) {
        return new SQL() {{
            UPDATE("claz");
            SET("name=${name}");
            WHERE("id=${id}");
        }}.toString();
    }

    public String insertClaz(final int id, final String name, final int level) {
        return new SQL() {{
            INSERT_INTO("claz");
            VALUES("id, name,level", "${id}, ${name},${level}");
        }}.toString();
    }
}
