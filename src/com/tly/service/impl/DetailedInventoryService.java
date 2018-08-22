package com.tly.service.impl;

import java.util.Map;

import com.tly.dao.IDetailedInventoryDao;
import com.tly.model.DetailedInventory;
import com.tly.service.IDetailedInventoryService;

public class DetailedInventoryService implements IDetailedInventoryService {

	private IDetailedInventoryDao ididao;
	
	public IDetailedInventoryDao getIdidao() {
		return ididao;
	}

	public void setIdidao(IDetailedInventoryDao ididao) {
		this.ididao = ididao;
	}

	/*
	 * 新增
	 */
	@Override
	public int insert(DetailedInventory di) {
		return ididao.insert(di);
	}

	/*
	 * 按条件查询
	 */
	@Override
	public DetailedInventory selectByTJ(Map<String, Object> map) {
		return ididao.selectByTJ(map);
	}

}
