package com.weiyu.controller;

import com.weiyu.model.User;
import com.weiyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author zhouyulong
 * @date 2018/10/6 下午9:39
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> selectUser() {
        List<User> user = userService.selectUser();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("data",user);
        return map;
    }
}
