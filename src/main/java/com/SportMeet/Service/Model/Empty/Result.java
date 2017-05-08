package com.SportMeet.Service.Model.Empty;

/**
 * Created by luohao on 2017/5/2.
 */
public class Result {
    private int num;
    private String msg;
    private String data;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "num=" + num +
                ", msg=" + msg +
                ", data='" + data + '\'' +
                '}';
    }
}
