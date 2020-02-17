/*package com.itdr.dao;

import com.itdr.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class UsersDaoImpl implements UsersDao{


    @Override
    public Users getUser(Integer id) {
        Users u = null;
        try {
            SqlSessionFactoryBuilder sf = new SqlSessionFactoryBuilder();
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory build = sf.build(in);
            SqlSession sqlSession = build.openSession();
            u = sqlSession.selectOne("getUser",id);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return u;
    }

    @Override
    public int addUser(String username,String password) {
        int i = 0;
        try{
            Users u = new Users();
            u.setId(null);
            u.setUsername("zhang");
            u.setPassword("123");
            SqlSessionFactoryBuilder sf = new SqlSessionFactoryBuilder();
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory build = sf.build(in);
            SqlSession sqlSession = build.openSession();
            i = sqlSession.insert("addUser",u);
            sqlSession.commit();
            sqlSession.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int deleteUser(Integer id) {
        int i = 0;
        try{
            Users u = new Users();
            u.setId(null);
            u.setUsername("zhang");
            u.setPassword("123");
            SqlSessionFactoryBuilder sf = new SqlSessionFactoryBuilder();
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory build = sf.build(in);
            SqlSession sqlSession = build.openSession();
            i = sqlSession.insert("deleteUser",id);
            sqlSession.commit();
            sqlSession.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int updateUser(Integer id, String password) {
        int i = 0;
        try{
            Users u = new Users();
            u.setId(id);
            u.setPassword(password);
            SqlSessionFactoryBuilder sf = new SqlSessionFactoryBuilder();
            InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory build = sf.build(in);
            SqlSession sqlSession = build.openSession();
            i = sqlSession.insert("updateUser",u);
            sqlSession.commit();
            sqlSession.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }
}*/
