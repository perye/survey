package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.AnScore;
import com.apsd.dwsurvey.entity.Question;

/**
 * 评分题
 * @author  Perye
 *
 *
 *
 */
public interface AnScoreManager extends BaseService<AnScore, String>{
	public List<AnScore>  findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
