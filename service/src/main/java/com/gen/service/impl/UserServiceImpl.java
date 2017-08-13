package com.gen.service.impl;

import com.gen.entity.User;
import com.gen.mapper.UserMapper;
import com.gen.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangjy on 2017/8/13.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public PageInfo<User> findList() {
        PageHelper.startPage(1, 1); // 核心分页代码
        //用PageInfo对结果进行包装
        List<User> userList = userMapper.findList();
        PageInfo page = new PageInfo(userList);
        return page;
    }
}
