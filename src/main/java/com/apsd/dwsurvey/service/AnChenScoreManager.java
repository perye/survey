package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.AnChenScore;
import com.apsd.dwsurvey.entity.Question;

/**
 * 矩陈评分题
 * @author  Perye
 *
 *
 *
 */
public interface AnChenScoreManager extends BaseService<AnChenScore, String>{
	public List<AnChenScore> findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
