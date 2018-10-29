package com.apsd.dwsurvey.dao.impl;

import java.util.List;

import com.apsd.dwsurvey.dao.AnDFillblankDao;
import org.springframework.stereotype.Repository;

import com.apsd.common.dao.BaseDaoImpl;
import com.apsd.dwsurvey.entity.AnDFillblank;
import com.apsd.dwsurvey.entity.QuMultiFillblank;
import com.apsd.dwsurvey.entity.Question;

/**
 * 多项填空 dao
 * @author  Perye
 *
 *
 *
 */

@Repository
public class AnDFillblankDaoImpl extends BaseDaoImpl<AnDFillblank, String> implements AnDFillblankDao {

	@Override
	public void findGroupStats(Question question) {
		String sql="select qu_item_id,count(*) from t_an_dfillblank where  visibility=1 and  qu_id=? group by qu_item_id";
		
		List<Object[]> list=this.getSession().createSQLQuery(sql).setString(0, question.getId()).list();
		List<QuMultiFillblank> quMultiFillblanks=question.getQuMultiFillblanks();
		
		for (QuMultiFillblank quMultiFillblank : quMultiFillblanks) {
			String quMultiFillblankId=quMultiFillblank.getId();
			for (Object[] objects : list) {
				if(quMultiFillblankId.equals(objects[0].toString())){
					quMultiFillblank.setAnCount(Integer.parseInt(objects[1].toString()));
					break;
				}
			}
		}
	}
	
}
