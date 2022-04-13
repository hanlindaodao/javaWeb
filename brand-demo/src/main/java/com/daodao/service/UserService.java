package com.daodao.service;

import com.daodao.mapper.UserMapper;
import com.daodao.pojo.User;
import com.daodao.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 登陆方法
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.select(username, password);
        sqlSession.close();
        return user;
    }

    /**
     * 注册方法
     * @return
     */
    public boolean register(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User u = userMapper.selectByUsername(user.getUsername());

        if (u == null) {
            userMapper.add(user);
            sqlSession.commit();
        }
        sqlSession.close();

        return u == null;

//        if (u == null) {
//            userMapper.add(user);
//            sqlSession.commit();
//            return true;
//        } else {
//            return false;
//        }
    }
}
