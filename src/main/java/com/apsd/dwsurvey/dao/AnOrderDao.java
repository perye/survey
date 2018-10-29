package com.apsd.dwsurvey.dao;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.AnOrder;
import com.apsd.dwsurvey.entity.Question;

/**
 * 排序题 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface AnOrderDao extends BaseDao<AnOrder, String>{

	public void findGroupStats(Question question);
	
}
