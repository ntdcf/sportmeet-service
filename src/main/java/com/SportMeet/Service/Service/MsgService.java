package com.SportMeet.Service.Service;

import com.SportMeet.Service.Interface.MsgInterface;
import com.SportMeet.Service.Model.Empty.Msg;
import com.SportMeet.Service.Model.MsgModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by luohao on 2017/5/9.
 */
@Service
public class MsgService implements MsgInterface {
    private MsgModel msgModel = new MsgModel();

    @Override
    public List<Msg> getToYestMsg() {
        return msgModel.getMsg();
    }

    @Override
    public boolean addMsg(Msg msg) {
        if (msgModel.addMsg(msg) != 0) {
            return true;
        }
        return false;
    }
}
