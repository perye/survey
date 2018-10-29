package com.apsd.dwsurvey.dao;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.AnScore;
import com.apsd.dwsurvey.entity.Question;

/**
 * 评分题 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface AnScoreDao extends BaseDao<AnScore, String>{

	public void findGroupStats(Question question);
	
}
