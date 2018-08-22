package com.tly.dao;

import java.util.List;

import com.tly.model.Administrator;

/**
 * 管理员
 * @author yangweihang
 *
 */
public interface IAdministratorDao {
	//查询所有的管理员
	public List<Administrator> selectAll();
	//新增管理员
	public int insert(Administrator a);
}
