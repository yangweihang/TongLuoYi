package com.tly.service;

import java.util.List;

import com.tly.model.Administrator;

public interface IAdministratorService {
	//查询全部
	public List<Administrator> selectAll();
	//新增管理员
	public int insert(Administrator a);
}
