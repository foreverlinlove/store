package com.lin.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lin.dao.UserMapper;
import com.lin.entity.UserPO;
import com.lin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * forever create on 19:11
 **/
@Service(value = "userServer")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserPO> getUsers() throws Exception {

        PageHelper.startPage(1,1);
        List<UserPO> list = userMapper.selectAll();
        //获取分页信息，强制转换为Page
//        ((Page) list).getTotal();
        return list;
    }
}
