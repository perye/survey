package com.apsd.dwsurvey.dao.impl;

import com.apsd.dwsurvey.dao.QuRadioDao;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

import com.apsd.common.dao.BaseDaoImpl;
import com.apsd.dwsurvey.entity.QuRadio;

/**
 * 单选题 dao
 * @author  Perye
 *
 *
 *
 */

//@Repository("quRadioDao")
@Repository
public class QuRadioDaoImpl extends BaseDaoImpl<QuRadio, String> implements QuRadioDao {
	
	public void quOrderByIdDel1(String quId,Integer orderById){
		if(quId!=null && !"".equals(quId)){
			String sql="update t_qu_radio set order_by_id=order_by_id-1 where qu_id=? and order_by_id>=?";
			//更新排序号
			SQLQuery query=this.getSession().createSQLQuery(sql);
			query.setString(0, quId);
			query.setInteger(1, orderById);
			query.executeUpdate();
		}
	}
	
}
