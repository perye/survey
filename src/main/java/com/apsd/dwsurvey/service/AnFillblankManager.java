package com.apsd.dwsurvey.service;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.AnFillblank;
import com.apsd.dwsurvey.entity.Question;

/**
 * 填空题
 * @author  Perye
 *
 *
 *
 */
public interface AnFillblankManager extends BaseService<AnFillblank, String>{
	public AnFillblank findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
