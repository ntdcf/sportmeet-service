package com.SportMeet.Service.Model;

import com.SportMeet.Service.Model.Empty.Activity;
import com.SportMeet.Service.Model.Empty.SignUp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by luohao on 2017/4/16.
 */
public class SignUpModel {
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

    public int addSignUp(SignUp signUp) {
        create();
        String SQLClass = "com.SportMeet.Service.Model.ActivityMapper.getActivity";
        int res = session.insert(SQLClass, signUp);
        session.commit();
        session.close();
        return res;
    }
}
