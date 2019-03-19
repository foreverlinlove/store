package com.lin.dao;

import com.lin.entity.UserPO;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserPO record);

    UserPO selectByPrimaryKey(Integer userId);

    List<UserPO> selectAll();

    int updateByPrimaryKey(UserPO record);
}