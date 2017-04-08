package com.SportMeet.Service.Interface;

import com.SportMeet.Service.Model.Empty.User;

import java.util.List;
import java.util.Map;

/**
 * Created by luohao3 on 2017/3/19.
 */
public interface UserInterface {
    public User findUser(String id);
    public boolean addUser(User user);
    public int editUser(User user);
    public List getCollage();
}
