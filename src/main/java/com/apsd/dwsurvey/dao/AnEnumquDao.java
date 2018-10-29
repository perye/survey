package com.apsd.dwsurvey.dao;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.AnEnumqu;

/**
 * 枚举题 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface AnEnumquDao extends BaseDao<AnEnumqu, String>{

	public void findGroupStats(Question question);

}
