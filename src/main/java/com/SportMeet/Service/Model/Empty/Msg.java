package com.SportMeet.Service.Model.Empty;

import com.google.gson.Gson;

/**
 * Created by luohao on 2017/5/9.
 */
public class Msg {
    private int id;
    private int user;
    private int time;
    private String msg;

    private String username;
    private String internetname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getInternetname() {
        return internetname;
    }

    public void setInternetname(String internetname) {
        this.internetname = internetname;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
