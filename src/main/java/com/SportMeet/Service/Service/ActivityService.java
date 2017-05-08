package com.SportMeet.Service.Service;

import com.SportMeet.Service.Interface.ActivityInterface;
import com.SportMeet.Service.Model.ActivityModel;
import com.SportMeet.Service.Model.Empty.Activity;
import com.SportMeet.Service.Model.Empty.SignUp;
import com.SportMeet.Service.Model.Empty.User;
import com.SportMeet.Service.Model.SignUpModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by luohao3 on 2017/3/20.
 */
@Service
public class ActivityService implements ActivityInterface {
    private ActivityModel activityModel;
    private SignUpModel signUpModel;

    public ActivityService() {
        activityModel = new ActivityModel();
        signUpModel = new SignUpModel();
    }

    @Override
    public List<Activity> getIndexActivity() {
        return activityModel.getActivity();
    }

    @Override
    public int addSignUp(SignUp signUp) {
        return signUpModel.addSignUp(signUp);
    }

    @Override
    public int getSignUpCount(SignUp signUp) {
        List<SignUp> signUps = signUpModel.getSignUp(signUp);
        return signUps.size();
    }

    @Override
    public int getSignUpCount(int userid) {
        return signUpModel.getCountUserSign(userid);
    }

    @Override
    public List<SignUp> getSignUp(User user) {
        return signUpModel.getSignUp(user);
    }

    @Override
    public List<Activity> getActivity(Activity activity) {
        return activityModel.getActivity(activity);
    }

    @Override
    public int deleteSignUp(SignUp signUp) {
        return signUpModel.deleteSignUpByUserAndAct(signUp);
    }

}
