package com.apsd.dwsurvey.dao.impl;


import java.util.List;

import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.dao.AnEnumquDao;
import com.apsd.dwsurvey.entity.AnEnumqu;
import org.springframework.stereotype.Repository;

import com.apsd.common.dao.BaseDaoImpl;

/**
 * 枚举 dao
 * @author  Perye
 *
 *
 *
 */

@Repository
public class AnEnumquDaoImpl extends BaseDaoImpl<AnEnumqu, String> implements AnEnumquDao {

	@Override
	public void findGroupStats(Question question) {
		String sql="select answer,count(answer) from t_an_enumqu where  visibility=1 and  qu_id=? GROUP BY answer";
		List<Object[]> list=this.getSession().createSQLQuery(sql).setString(0, question.getId()).list();
		
		//一共有多少对枚举数
		if(list!=null && list.size()>0){
			question.setAnCount(list.size());
		}
	}
	
}
