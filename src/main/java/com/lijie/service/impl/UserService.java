package com.lijie.service.impl;

import com.lijie.dao.UserInfo;
import com.lijie.service.IUserService;
import com.lijie.util.Log;
import org.springframework.stereotype.Service;

/**
 * @author lijie7
 * @date 2018/1/30
 * @Description
 * @modified By
 */
@Service("userService")
public class UserService implements IUserService {
    @Override
    public void regAccount(UserInfo userInfo) {
        Log.info("注册用户成功");
    }

    @Override
    public void updateAccount(UserInfo userInfo) {
        Log.info("更新用户成功");
    }

    @Override
    public void delAccount(int userId) {
        Log.info("删除用户成功,userId:"+userId);
    }
}
