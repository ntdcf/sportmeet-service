package com.SportMeet.Service.Model.Empty;

import com.google.gson.Gson;

/**
 * Created by luohao on 2017/4/8.
 */
public class Collage {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
