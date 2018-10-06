package com.weiyu.mapper;

import com.weiyu.model.User;

import java.util.List;

/**
 *
 * @author zhouyulong
 * @date 2018/10/6 下午9:39
 */
public interface UserMapper {

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> selectUser();
}
