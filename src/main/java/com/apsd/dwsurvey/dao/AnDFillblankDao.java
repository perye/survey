package com.apsd.dwsurvey.dao;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.AnDFillblank;
import com.apsd.dwsurvey.entity.Question;

/**
 * 多项填空题 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface AnDFillblankDao extends BaseDao<AnDFillblank, String>{

	public void findGroupStats(Question question);

}
