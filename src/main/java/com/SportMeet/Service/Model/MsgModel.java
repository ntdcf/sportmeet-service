package com.SportMeet.Service.Model;

import com.SportMeet.Service.Model.Empty.Msg;

import java.util.List;

/**
 * Created by luohao on 2017/5/9.
 */
public class MsgModel extends BaseModel {
    public List<Msg> getMsg() {
        create();
        String SQLClass = "com.SportMeet.Service.Model.MsgMapper.getMsgToYestDay";
        List<Msg> list = session.selectList(SQLClass);
        session.close();
        return list;
    }

    public int addMsg(Msg msg) {
        create();
        String SQLClass = "com.SportMeet.Service.Model.MsgMapper.addMsg";
        int res = session.insert(SQLClass, msg);
        session.commit();
        session.close();
        return res;
    }
}
