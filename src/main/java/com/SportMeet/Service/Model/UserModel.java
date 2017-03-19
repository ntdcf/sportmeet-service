package com.SportMeet.Service.Model;

import com.SportMeet.Service.Model.Empty.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by luohao3 on 2017/3/19.
 */
public class UserModel {
    private String resource = "config/mybatis/mybatisConfig.xml";
    private InputStream inputStream=null;
    private SqlSessionFactory sqlSessionFactory=null;
    private SqlSession session=null;

    private void create() {
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession();
    }

    public User getUser(String id) {
        create();
        String SQLClass = "com.SportMeet.Service.Model.UserMapper.getUser";
        User user = session.selectOne(SQLClass, id);
        session.close();
        return user;
    }
}
