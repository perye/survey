package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.AnCheckbox;
import com.apsd.dwsurvey.entity.DataCross;
import com.apsd.dwsurvey.entity.Question;

/**
 * 多选题业务
 * @author  Perye
 *
 *
 *
 */

public interface AnCheckboxManager extends BaseService<AnCheckbox, String>{
	public List<AnCheckbox> findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);

	public List<DataCross> findStatsDataCross(Question rowQuestion,
			Question colQuestion);

	public List<DataCross> findStatsDataChart(Question question);
}
