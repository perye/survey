package com.apsd.dwsurvey.dao.impl;

import com.apsd.dwsurvey.dao.AnAnswerDao;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.AnAnswer;
import org.springframework.stereotype.Repository;

import com.apsd.common.dao.BaseDaoImpl;

/**
 * 答卷 dao
 * @author  Perye
 *
 *
 *
 */


@Repository
public class AnAnswerDaoImpl extends BaseDaoImpl<AnAnswer, String> implements AnAnswerDao {

	@Override
	public void findGroupStats(Question question) {
		String sql="select count(case when answer='' then answer end) emptyCount, count(case when answer!='' then answer end) blankCount from t_an_answer where visibility=1 and qu_id=?";
		
		Object[] objs=(Object[]) this.getSession().createSQLQuery(sql).setString(0, question.getId()).uniqueResult();
		
		question.setRowContent(objs[0].toString());//未回答数
		question.setOptionContent(objs[1].toString());//回答的项数
		question.setAnCount(Integer.parseInt(objs[1].toString()));
	}

}
