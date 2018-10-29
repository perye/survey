package com.apsd.dwsurvey.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.apsd.dwsurvey.service.QuChenOptionManager;
import com.apsd.dwsurvey.dao.QuChenOptionDao;
import com.apsd.dwsurvey.entity.QuChenOption;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apsd.common.plugs.page.Page;
import com.apsd.common.plugs.page.PropertyFilter;
import com.apsd.common.service.BaseServiceImpl;


/**
 * 矩陈题选项
 * @author  Perye
 *
 *
 *
 */
@Service
public class QuChenOptionManagerImpl extends BaseServiceImpl<QuChenOption, String> implements QuChenOptionManager {

	@Autowired
	private QuChenOptionDao quChenOptionDao;
	
	@Override
	public void setBaseDao() {
		this.baseDao=quChenOptionDao;
	}

	@Override
	public List<QuChenOption> findByQuId(String quId) {
		Page<QuChenOption> page=new Page<QuChenOption>();
		page.setOrderBy("orderById");
		page.setOrderDir("asc");
		
		List<PropertyFilter> filters=new ArrayList<PropertyFilter>();
		filters.add(new PropertyFilter("EQS_quId", quId));
		return findAll(page, filters);
	}

	@Override
	public String getContentByQuId(String quId) {
		String content="";
		if(quId!=null && !"".equals(quId)){
			List<QuChenOption> options=findByQuId(quId);
			for (QuChenOption quChenOption : options) {
				content+=quChenOption.getOptionName()+"\r\n";
			}
		}
		return content;
	}
	
	public int getOrderById(String quId){
		Criterion criterion=Restrictions.eq("quId", quId);
		QuChenOption quChenOption=quChenOptionDao.findFirst("orderById", false, criterion);
		if(quChenOption!=null){
			return quChenOption.getOrderById();
		}
		return 0;
	}
	
	@Override
	@Transactional
	public QuChenOption upOptionName(String quId,String quItemId, String optionName) {
		if(quItemId!=null && !"".equals(quItemId)){
			QuChenOption quChenOption=quChenOptionDao.get(quItemId);
			quChenOption.setOptionName(optionName);
			quChenOptionDao.save(quChenOption);
			return quChenOption;
		}else{
			//取orderById
			int orderById=getOrderById(quId);
			//新加选项
			QuChenOption quChenOption=new QuChenOption();
			quChenOption.setQuId(quId);
			quChenOption.setOptionName(optionName);
			//title
			quChenOption.setOrderById(++orderById);
			quChenOptionDao.save(quChenOption);
			return quChenOption;
		}
	}
}
