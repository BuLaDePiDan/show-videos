package com.show.admin.scetc.service;

import java.util.List;

import com.show.admin.scetc.pojo.AdminUser;

public interface AdminUserService {

	public AdminUser findByUserName(String username);
    public List<AdminUser> queryAll();//查询全部的管理员用户
	
	
}