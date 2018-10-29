package com.apsd.dwsurvey.dao;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.Question;

/**
 * 题基础 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface QuestionDao extends BaseDao<Question, String>{
	
	public void update(Question entity);
	public void quOrderByIdDel1(String belongId,Integer orderById);
}
