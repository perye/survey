package com.apsd.dwsurvey.dao.impl;

import com.apsd.dwsurvey.entity.AnFillblank;
import org.springframework.stereotype.Repository;

import com.apsd.common.dao.BaseDaoImpl;
import com.apsd.dwsurvey.dao.AnFillblankDao;
import com.apsd.dwsurvey.entity.Question;

/**
 * 填空 dao
 * @author  Perye
 *
 *
 *
 */

@Repository
public class AnFillblankDaoImpl extends BaseDaoImpl<AnFillblank, String> implements AnFillblankDao{

	@Override
	public void findGroupStats(Question question) {
		String sql="select count(case when answer='' then answer end) emptyCount, count(case when answer!='' then answer end) blankCount from t_an_fillblank where  visibility=1 and  qu_id=?";
		Object[] objs=(Object[]) this.getSession().createSQLQuery(sql).setString(0, question.getId()).uniqueResult();
		
		question.setRowContent(objs[0].toString());//未回答数
		question.setOptionContent(objs[1].toString());//回答的项数
		question.setAnCount(Integer.parseInt(objs[1].toString()));
	}

}
