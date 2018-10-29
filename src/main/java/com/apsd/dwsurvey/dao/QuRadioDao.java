package com.apsd.dwsurvey.dao;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.QuRadio;

public interface QuRadioDao extends BaseDao<QuRadio, String> {
	
	public void quOrderByIdDel1(String quId,Integer orderById);
	
}
