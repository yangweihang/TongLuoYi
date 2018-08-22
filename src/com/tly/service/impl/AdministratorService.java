package com.tly.service.impl;

import java.util.List;

import com.tly.dao.IAdministratorDao;
import com.tly.model.Administrator;
import com.tly.service.IAdministratorService;

/**
 * 管理员
 * @author yangweihang
 *
 */
public class AdministratorService implements IAdministratorService {

	private IAdministratorDao iadao; 
	
	public IAdministratorDao getIadao() {
		return iadao;
	}

	public void setIadao(IAdministratorDao iadao) {
		this.iadao = iadao;
	}

	/*
	 *查询全部
	 */
	@Override
	public List<Administrator> selectAll() {
		return iadao.selectAll();
	}

	/*
	 *新增管理员
	 */
	@Override
	public int insert(Administrator a) {
		return iadao.insert(a);
	}

}
