package com.SportMeet.Service.Service;

import com.SportMeet.Service.Interface.UserInterface;
import com.SportMeet.Service.Model.Empty.Collage;
import com.SportMeet.Service.Model.Empty.User;
import com.SportMeet.Service.Model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public int editUser(User user) {
        return userModel.updateUserById(user);
    }

    @Override
    public List<Collage> getCollage() {
        return userModel.getCollageInCollTb();
    }

    @Override
    public Map<Integer, String> findUser(List userid) {
        return null;
    }
}
