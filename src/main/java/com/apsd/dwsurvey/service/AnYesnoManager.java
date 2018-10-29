package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.AnYesno;
import com.apsd.dwsurvey.entity.DataCross;
import com.apsd.dwsurvey.entity.Question;

/**
 * 是非题
 * @author  Perye
 *
 *
 *
 */
public interface AnYesnoManager extends BaseService<AnYesno, String>{
	public AnYesno findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);

	public List<DataCross> findStatsDataCross(Question rowQuestion, Question colQuestion);

	public List<DataCross> findStatsDataChart(Question question);
}
