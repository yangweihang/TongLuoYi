package com.tly.dao;

import com.tly.model.PartnerGrade;

/**
 * 合伙人上下级对应表
 * @author yangweihang
 *
 */
public interface IPartnerGradeDao {
	//增加上级id
	public int inserton(PartnerGrade pg);
	//增加下级id
	public int insertup(PartnerGrade pg);
}
