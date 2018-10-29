package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.AnDFillblank;
import com.apsd.dwsurvey.entity.Question;

/**
 * 多项填空题
 * @author  Perye
 *
 *
 *
 */
public interface AnDFillblankManager extends BaseService<AnDFillblank, String>{
	public List<AnDFillblank> findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
