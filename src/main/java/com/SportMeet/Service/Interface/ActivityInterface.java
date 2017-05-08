package com.SportMeet.Service.Interface;

import com.SportMeet.Service.Model.Empty.Activity;
import com.SportMeet.Service.Model.Empty.SignUp;
import com.SportMeet.Service.Model.Empty.User;

import java.util.List;

/**
 * Created by luohao3 on 2017/3/20.
 */
public interface ActivityInterface {
    public List<Activity> getIndexActivity();
    public int addSignUp(SignUp signUp);
    public int getSignUpCount(SignUp signUp);
    public int getSignUpCount(int userid);
    public List<SignUp> getSignUp(User user);
    public List<Activity> getActivity(Activity activity);
    public int deleteSignUp(SignUp signUp);
}
