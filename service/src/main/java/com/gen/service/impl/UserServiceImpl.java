package com.gen.service.impl;

import com.alibaba.fastjson.JSON;
import com.gen.entity.User;
import com.gen.mapper.UserMapper;
import com.gen.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangjy on 2017/8/13.
 */
@Service
public class UserServiceImpl implements UserService{

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;
    @Override
    public PageInfo<User> findList() {
        PageHelper.startPage(1, 1); // 核心分页代码
        //用PageInfo对结果进行包装
        List<User> userList = userMapper.findList();
        PageInfo page = new PageInfo(userList);
        logger.info("查询结果 service={}",new Object[]{JSON.toJSONString(page)});
        return page;
    }
}
