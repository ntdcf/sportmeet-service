package com.SportMeet.Service.Model.Empty;

/**
 * Created by luohao3 on 2017/3/20.
 */
public class Activity {
    private int id;
    private String sendtime;
    private int user;
    private String msg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", sendtime='" + sendtime + '\'' +
                ", user=" + user +
                ", msg='" + msg + '\'' +
                '}';
    }
}
