package com.tly.dao;

import java.util.Map;

import com.tly.model.Grade;

public interface IGradeDao {
	/**
	 * 增加上级id
	 * @param id
	 * @return
	 */
	public int insertOnId(Grade g);
	/**
	 * 增加下级id
	 * @param id
	 * @return
	 */
	public int insertUpId(Grade g);
	//查询下线有多少人
	public Integer selectByUp(int id);
	//删除没有消费的会员
	public int deleteNotXiaofei(Integer[] in);
}
