package com.gen.service;


import com.gen.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by wangjy on 2017/8/13.
 */
public interface UserService {
   public PageInfo<User> findList();
}
