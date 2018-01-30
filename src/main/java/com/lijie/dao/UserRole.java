package com.lijie.dao;

import sun.dc.pr.PRError;

/**
 * @author lijie7
 * @date 2018/1/30
 * @Description
 * @modified By
 */
public enum UserRole {
    SUPERADMIN(0, "超级管理员"),
    ADMIN(1, "管理员"),
    NOUSER(2, "普通用户");

    private int roleLevel;
    private String roleDescribe;

    UserRole(int roleLevel, String roleDescribe) {
        this.roleLevel = roleLevel;
        this.roleDescribe = roleDescribe;
    }
}
