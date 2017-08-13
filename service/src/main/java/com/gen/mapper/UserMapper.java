package com.gen.mapper;

import com.gen.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by wangjy on 2017/8/13.
 */
@Component
public interface UserMapper {
    List<User> findList();
}
