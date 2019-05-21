package com.soft.dao.impl;

import com.soft.dao.IUserDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("userDAO")
public class UserDAOImpl implements IUserDAO {
    @Autowired
    SqlSessionFactory sessionFactoryBean;

    @Override
    public String login(String uname, String upwd) {
        SqlSession sqlSession = sessionFactoryBean.openSession(true);//true  开启事务
        String statment = "com.isoft.mapping.userMapper.login";
        Map map = new HashMap();
        map.put("uname", uname);
        map.put("upwd", upwd);
        List<Map<String, Object>> list = sqlSession.selectList(statment, map);
        if (list.size() > 0)
            return "success";
        else
            return "fault";
    }

    @Override
    public boolean register(String uname, String upwd, String email) {
        System.out.println(email);
        return true;
    }
}
