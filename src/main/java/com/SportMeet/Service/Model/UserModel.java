package com.SportMeet.Service.Model;

import com.SportMeet.Service.Model.Empty.Collage;
import com.SportMeet.Service.Model.Empty.User;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by luohao3 on 2017/3/19.
 */
public class UserModel extends BaseModel {
    public User getUser(String id) {
        create();
        String SQLClass = "com.SportMeet.Service.Model.UserMapper.getUser";
        User user = session.selectOne(SQLClass, id);
        session.close();
        return user;
    }

    public boolean insertUserByUnPw(User user) {
        int res = 0;
        try {
            create();
            String SQLClass = "com.SportMeet.Service.Model.UserMapper.insertUserReg";
            session.insert(SQLClass, user);
            session.commit();
            session.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public int updateUserById(User user) {
        int res = 0;
        try {
            create();
            String SQLClass = "com.SportMeet.Service.Model.UserMapper.updateUserByid";
            res = session.update(SQLClass, user);
            session.commit();
            session.close();
        } catch (Exception e) {
            return 0;
        }
        return res;
    }

    public List<Collage> getCollageInCollTb() {
        create();
        String SQLClass = "com.SportMeet.Service.Model.UserMapper.getCollageInCollage";
        List<Collage> res = session.selectList(SQLClass);
        session.close();
        return res;
    }
}
