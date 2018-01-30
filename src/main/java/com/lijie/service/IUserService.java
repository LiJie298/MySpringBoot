package com.lijie.service;

import com.lijie.dao.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lijie7
 * @date 2018/1/30
 * @Description
 * @modified By
 */
public interface IUserService {
    /**
     * 用户注册
     * @param userInfo
     */
    void regAccount(UserInfo userInfo);
    /**
     * 用户更新
     * @param userInfo
     */
    void updateAccount(UserInfo userInfo);
    /**
     * 用户删除
     * @param userId
     */
    void delAccount(int userId);
}
