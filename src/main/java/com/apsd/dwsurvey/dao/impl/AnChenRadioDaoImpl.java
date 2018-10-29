package com.apsd.dwsurvey.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.apsd.dwsurvey.dao.AnChenRadioDao;
import com.apsd.dwsurvey.entity.AnChenRadio;
import com.apsd.dwsurvey.entity.QuChenColumn;
import com.apsd.dwsurvey.entity.QuChenRow;
import com.apsd.dwsurvey.entity.Question;
import org.springframework.stereotype.Repository;

import com.apsd.common.dao.BaseDaoImpl;

/**
 * 矩陈单选 dao
 * @author  Perye
 *
 *
 *
 */

@Repository
public class AnChenRadioDaoImpl extends BaseDaoImpl<AnChenRadio, String> implements AnChenRadioDao {

	@Override
	public void findGroupStats(Question question) {
		//String sql="select qu_row_id,count(qu_row_id) from t_an_chen_radio where qu_id=? GROUP BY qu_row_id";
		String sql="select qu_row_id,qu_col_id,count(qu_col_id) from t_an_chen_radio where  visibility=1 and  qu_id=? GROUP BY qu_row_id,qu_col_id";
		List<Object[]> list=this.getSession().createSQLQuery(sql).setString(0, question.getId()).list();
		
		List<QuChenRow> quChenRows=question.getRows();
		List<QuChenColumn> quChenColumns=question.getColumns();
		
		int count=0;
		for (QuChenRow quChenRow : quChenRows) {
			
			String quChenRowId=quChenRow.getId();
//			for (QuChenColumn quChenColumn : quChenColumns) {
//				
//				String quChenColId=quChenColumn.getId();
//				for (Object[] objects : list) {
//					if(quChenRowId.equals(objects[0].toString()) && quChenColId.equals(objects[1].toString())){
//						int anCount=Integer.parseInt(objects[2].toString());
//						count+=anCount;
//						quChenRow.setAnCount(quChenRow.getAnCount()+anCount);
//						//quChenColumn.setAnCount(anCount);;
//						continue;
//					}
//				}
//				
//			}
			
			for (Object[] objects : list) {
				if(quChenRowId.equals(objects[0].toString())){
					int anCount=Integer.parseInt(objects[2].toString());
					count+=anCount;
					quChenRow.setAnCount(quChenRow.getAnCount()+anCount);
					//quChenColumn.setAnCount(anCount);;
					break;
				}
			}
			
		}
		question.setAnCount(count);
		
		
		List<AnChenRadio> anChenRadios=new ArrayList<AnChenRadio>();
		
		for (Object[] objects : list) {
			AnChenRadio anChenRadio=new AnChenRadio();
			//anChenRadio.setBelongId(belongId);
			anChenRadio.setQuRowId(objects[0].toString());
			anChenRadio.setQuColId(objects[1].toString());
			int anCount=Integer.parseInt(objects[2].toString());
			anChenRadio.setAnCount(anCount);
			anChenRadios.add(anChenRadio);
		}
		
		question.setAnChenRadios(anChenRadios);
		
		
		
		
	}
	
}
