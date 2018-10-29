package com.apsd.dwsurvey.dao;

import java.util.List;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.AnCheckbox;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.DataCross;


/**
 * 多选题数据 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface AnCheckboxDao extends BaseDao<AnCheckbox, String>{

	public void findGroupStats(Question question);

	public List<DataCross> findStatsDataCross(Question rowQuestion,
                                              Question colQuestion);

	public List<DataCross> findStatsDataChart(Question question);

}
