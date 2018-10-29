package com.apsd.dwsurvey.dao;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.AnChenScore;
import com.apsd.dwsurvey.entity.Question;

/**
 * 矩陈评分题 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface AnChenScoreDao extends BaseDao<AnChenScore, String>{

	public void findGroupStats(Question question);

}
