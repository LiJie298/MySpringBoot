package com.lijie.controller;

import com.lijie.dao.UserInfo;
import com.lijie.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lijie7
 * @date 2018/1/30
 * @Description
 * @modified By
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService service;
    /**
     * 用户注册
     * @param userInfo
     */
    @RequestMapping(value = "register",method = RequestMethod.GET)
    private void registerAccount(@RequestParam UserInfo userInfo){
        service.regAccount(userInfo);
    }

    /**
     * 用户修改
     * @param userInfo
     */
    @RequestMapping(value = "update",method = RequestMethod.GET)
    private void updateAccount(@RequestParam UserInfo userInfo){
        service.updateAccount(userInfo);
    }

    /**
     *
     * @param userId
     */
    @ResponseBody
    @RequestMapping(value = "delAccount",method = RequestMethod.GET)
    private void delAccount(@RequestParam int userId){
        service.delAccount(userId);
    }
}
