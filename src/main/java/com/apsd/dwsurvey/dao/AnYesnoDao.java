package com.apsd.dwsurvey.dao;

import java.util.List;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.AnYesno;
import com.apsd.dwsurvey.entity.DataCross;
import com.apsd.dwsurvey.entity.Question;

/**
 * 是非题 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface AnYesnoDao extends BaseDao<AnYesno, String>{

	public void findGroupStats(Question question);

	public List<DataCross> findStatsDataCross(Question rowQuestion, Question colQuestion);

	public List<DataCross> findStatsDataChart(Question question);

}
