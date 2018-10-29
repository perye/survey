package com.apsd.dwsurvey.dao;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.AnChenCheckbox;

/**
 * 矩陈多选题数据 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface AnChenCheckboxDao extends BaseDao<AnChenCheckbox, String>{

	public void findGroupStats(Question question);

}
