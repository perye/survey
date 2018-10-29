package com.apsd.dwsurvey.dao;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.AnChenFbk;
import com.apsd.dwsurvey.entity.Question;

/**
 * 矩陈填空题数据 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface AnChenFbkDao extends BaseDao<AnChenFbk, String>{

	void findGroupStats(Question question);
	
}
