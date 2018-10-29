package com.apsd.dwsurvey.service;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.AnAnswer;

/**
 * 答卷业务
 * @author  Perye
 *
 *
 *
 */

public interface AnAnswerManager extends BaseService<AnAnswer, String> {
	public AnAnswer findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
