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
public class ActivityModel extends BaseModel {
    public List<Activity> getActivity() {
        create();
        String SQLClass = "com.SportMeet.Service.Model.ActivityMapper.getActivity";
        List<Activity> list = session.selectList(SQLClass);
        session.close();
        return list;
    }

    public List<Activity> getActivity(Activity activity) {
        create();
        String SQLClass = "com.SportMeet.Service.Model.ActivityMapper.getActivityByName";
        List<Activity> list = session.selectList(SQLClass, activity);
        session.close();
        return list;
    }
}
