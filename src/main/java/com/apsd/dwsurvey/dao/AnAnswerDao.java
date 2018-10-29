package com.apsd.dwsurvey.dao;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.AnAnswer;
import com.apsd.dwsurvey.entity.Question;

/**
 * 答卷数据 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface AnAnswerDao extends BaseDao<AnAnswer, String> {

	public void findGroupStats(Question question);

}
