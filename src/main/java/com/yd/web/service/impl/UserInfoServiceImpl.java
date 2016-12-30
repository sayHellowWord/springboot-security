package com.yd.web.service.impl;


import javax.annotation.Resource;

import com.yd.web.bean.UserInfo;
import com.yd.web.dao.UserInfoRepository;
import com.yd.web.service.UserInfoService;
import org.springframework.stereotype.Service;



@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoRepository.findByUsername(username);
    }

}