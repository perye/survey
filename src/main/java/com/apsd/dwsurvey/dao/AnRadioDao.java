package com.apsd.dwsurvey.dao;

import java.util.List;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.AnRadio;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.DataCross;

/**
 * 单选题 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface AnRadioDao extends BaseDao<AnRadio, String> {

	public void findGroupStats(Question question);

	public List<DataCross> findStatsDataCross(Question rowQuestion,
			Question colQuestion);

	public List<DataCross> findStatsDataChart(Question question);

}
