package com.SportMeet.Service.API;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by luohao3 on 2017/2/6.
 */
public class UserSessionContext {
    private static Map map = new HashMap();

    public static synchronized void addSession(HttpSession session) {
        if (session != null) {
            map.put(session.getId(), session);
        }
    }

    public static synchronized HttpSession getSession(String SessionId) {
        if (SessionId == null) {
            return null;
        }
        return (HttpSession) map.get(SessionId);
    }

    public static synchronized void deleteSession(HttpSession session) {
        if (session != null) {
            map.remove(session.getId());
        }
    }
}
