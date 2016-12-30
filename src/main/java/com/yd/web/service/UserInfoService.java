package com.yd.web.service;


import com.yd.web.bean.UserInfo;

public interface UserInfoService {

    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);

}