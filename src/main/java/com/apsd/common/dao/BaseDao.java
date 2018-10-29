package com.apsd.common.dao;

import java.io.Serializable;


/**
 * @author  Perye
 *
 *
 *
 */
public interface BaseDao<T,ID extends Serializable> extends IHibernateDao<T, ID>{
	
}
