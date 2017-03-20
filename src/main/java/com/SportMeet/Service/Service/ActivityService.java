package com.SportMeet.Service.Service;

import com.SportMeet.Service.Interface.ActivityInterface;
import com.SportMeet.Service.Model.ActivityModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by luohao3 on 2017/3/20.
 */
@Service
public class ActivityService implements ActivityInterface {
    private ActivityModel activityModel;

    public ActivityService() {
        activityModel = new ActivityModel();
    }

    @Override
    public List getIndexActivity() {
        return activityModel.getActivity();
    }
}
