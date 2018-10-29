package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.AnChenRadio;
import com.apsd.dwsurvey.entity.DataCross;

/**
 * 矩陈单选题
 * @author  Perye
 *
 *
 *
 */

public interface AnChenRadioManager extends BaseService<AnChenRadio, String>{
	public List<AnChenRadio> findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);

	public List<DataCross> findStatsDataChart(Question question);
}
