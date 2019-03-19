package com.lin.service;

import com.lin.entity.UserPO;

import java.util.List;

/**
 * forever create on 14:21
 **/
public interface UserService {
	List<UserPO> getUsers() throws Exception;
}
