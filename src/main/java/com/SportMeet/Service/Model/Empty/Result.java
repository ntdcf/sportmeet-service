package com.SportMeet.Service.Model.Empty;

import com.google.gson.Gson;

/**
 * Created by luohao on 2017/5/2.
 * 用来生成返回结果的类，重写了toString方法返回json
 */
public class Result<E> {
    private int num;
    private boolean res;
    private String msg;
    private E data;

    public Result(int num, boolean res, String msg, E data) {
        this.num = num;
        this.res = res;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
