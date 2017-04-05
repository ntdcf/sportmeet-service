package com.SportMeet.Service.Model;

import com.SportMeet.Service.Model.Empty.Activity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by luohao3 on 2017/3/20.
 */
public class ActivityModel {
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

    public List<Activity> getActivity() {
        create();
        String SQLClass = "com.SportMeet.Service.Model.ActivityMapper.getActivity";
        List<Activity> list = session.selectList(SQLClass);
        session.close();
        return list;
    }
}
