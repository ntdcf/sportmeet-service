package com.SportMeet.Service.Service;

import com.SportMeet.Service.Interface.UserInterface;
import com.SportMeet.Service.Model.Empty.User;
import com.SportMeet.Service.Model.UserModel;
import org.springframework.stereotype.Service;

/**
 * Created by luohao3 on 2017/3/19.
 */
@Service
public class UserService implements UserInterface {
    private UserModel userModel;

    public UserService() {
        userModel = new UserModel();
    }

    @Override
    public User findUser(String id) {
        return userModel.getUser(id);
    }

    @Override
    public boolean addUser(User user) {
        return userModel.insertUserByUnPw(user);
    }
}
