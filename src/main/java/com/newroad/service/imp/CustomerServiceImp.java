package com.newroad.service.imp;

import com.newroad.dao.UserMapper;
import com.newroad.entity.User;
import com.newroad.service.CustomerServiceIf;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CustomerServiceImp implements CustomerServiceIf {
    @Resource
   private UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
