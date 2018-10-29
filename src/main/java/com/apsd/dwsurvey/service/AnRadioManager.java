package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.AnRadio;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.DataCross;

/**
 * 单选题
 * @author  Perye
 *
 *
 *
 */
public interface AnRadioManager extends BaseService<AnRadio, String>{
	public AnRadio findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);

	public List<DataCross> findStatsDataCross(Question rowQuestion,
			Question colQuestion);

	public List<DataCross> findStatsDataChart(Question question);
}
