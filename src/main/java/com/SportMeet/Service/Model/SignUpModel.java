package com.SportMeet.Service.Model;

import com.SportMeet.Service.Model.Empty.SignUp;
import com.SportMeet.Service.Model.Empty.User;

import java.util.List;

/**
 * Created by luohao on 2017/4/16.
 */
public class SignUpModel extends BaseModel {
    public int addSignUp(SignUp signUp) {
        create();
        String SQLClass = "com.SportMeet.Service.Model.ActivityMapper.addSignUp";
        int res = session.insert(SQLClass, signUp);
        session.commit();
        session.close();
        return res;
    }

    public List<SignUp> getSignUp(SignUp signUp) {
        create();
        String SQLClass = "com.SportMeet.Service.Model.ActivityMapper.getSignUp";
        List<SignUp> res = session.selectList(SQLClass, signUp);
        session.close();
        return res;
    }

    public List<SignUp> getSignUp(User user) {
        create();
        String SQLClass = "com.SportMeet.Service.Model.ActivityMapper.getSignUpByUserId";
        List<SignUp> res = session.selectList(SQLClass, user);
        session.close();
        return res;
    }

    public int getCountUserSign(int userid) {
        create();
        String SQLClass = "com.SportMeet.Service.Model.ActivityMapper.getCountUserSign";
        int res = session.selectOne(SQLClass, userid);
        session.close();
        return res;
    }

    public int deleteSignUpByUserAndAct(SignUp signUp) {
        create();
        String SQLClass = "com.SportMeet.Service.Model.ActivityMapper.deleteSignUp";
        int res = session.delete(SQLClass, signUp);
        session.commit();
        session.close();
        return res;
    }

}
