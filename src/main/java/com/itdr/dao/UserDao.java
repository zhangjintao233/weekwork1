package com.itdr.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


public class UserDao {

    private JdbcTemplate jt;

    public int selectUsers(String bname) {
        String sql ="SELECT username FROM users WHERE username=?";
        List<Map<String, Object>> maps = jt.queryForList(sql, bname);
        for (Map<String, Object> map : maps) {
            for (String u : map.keySet()) {
                if (map.get(u).equals(bname)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public int updateMoney(String name, int money, int i) {
        int update = 0;
        if (i == 0) {
            update = jt.update("UPDATE users SET money=money-? WHERE username=?", money, name);
        } else if (i == 1) {
            update = jt.update("UPDATE users SET money=money+? WHERE username=?", money, name);
        }
        return update;
    }

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    public JdbcTemplate getJt() {
        return jt;
    }
}
