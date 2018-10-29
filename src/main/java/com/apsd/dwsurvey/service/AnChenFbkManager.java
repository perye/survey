package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.AnChenFbk;
import com.apsd.dwsurvey.entity.Question;

/**
 * 矩陈填空题
 * @author  Perye
 *
 *
 *
 */

public interface AnChenFbkManager extends BaseService<AnChenFbk, String>{
	public List<AnChenFbk> findAnswer(String belongAnswerId,String quId);
	
	public void findGroupStats(Question question);
}
