package com.SportMeet.Service.Interface;

import com.SportMeet.Service.Model.Empty.Msg;

import java.util.List;

/**
 * Created by luohao on 2017/5/9.
 */
public interface MsgInterface {
    public List<Msg> getToYestMsg();
    public boolean addMsg(Msg msg);
}
