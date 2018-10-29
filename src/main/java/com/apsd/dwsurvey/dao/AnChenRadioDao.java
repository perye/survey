package com.apsd.dwsurvey.dao;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.AnChenRadio;

/**
 * 矩陈单选题数据 interface
 * @author  Perye
 *
 *
 *
 *
 */
public interface AnChenRadioDao extends BaseDao<AnChenRadio, String>{

	public void findGroupStats(Question question);

}
