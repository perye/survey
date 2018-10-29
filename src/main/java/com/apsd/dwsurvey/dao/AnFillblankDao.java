package com.apsd.dwsurvey.dao;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.AnFillblank;
import com.apsd.dwsurvey.entity.Question;

/**
 * 填空题 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface AnFillblankDao extends BaseDao<AnFillblank, String>{

	public void findGroupStats(Question question);

}
