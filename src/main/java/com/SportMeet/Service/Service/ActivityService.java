package com.SportMeet.Service.Service;

import com.SportMeet.Service.Interface.ActivityInterface;
import com.SportMeet.Service.Model.ActivityModel;
import com.SportMeet.Service.Model.Empty.Activity;
import com.SportMeet.Service.Model.Empty.SignUp;
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
    }

    @Override
    public List<Activity> getIndexActivity() {
        return activityModel.getActivity();
    }

    @Override
    public int addSignUp(SignUp signUp) {
        return signUpModel.addSignUp(signUp);
    }
}
