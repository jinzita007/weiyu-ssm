package com.weiyu.service.impl;

import com.weiyu.mapper.UserMapper;
import com.weiyu.model.User;
import com.weiyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhouyulong on 2018/10/6 下午10:14.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUser(){
        return userMapper.selectUser();
    }
}
