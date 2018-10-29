package com.apsd.dwsurvey.action;

import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.apsd.common.base.action.CrudActionSupport;
import com.apsd.common.utils.web.Struts2Utils;
import com.apsd.dwsurvey.entity.SysLog;

/**
 * 系统日志分析 action
 * @author  Perye
 *
 *
 *
 *
 */
@Namespaces({@Namespace("/sy/system"),@Namespace("/sy/system/nosm")})
@InterceptorRefs({ @InterceptorRef("paramsPrepareParamsStack") })
@Results({
	@Result(name=CrudActionSupport.SUCCESS,location="/WEB-INF/page/diaowen-system/log-list.jsp",type=Struts2Utils.DISPATCHER),
	@Result(name=CrudActionSupport.INPUT,location="/WEB-INF/page/diaowen-system/log-list.jsp",type=Struts2Utils.DISPATCHER),
	@Result(name=CrudActionSupport.RELOAD,location="/WEB-INF/page/ref-parent.jsp",type=Struts2Utils.DISPATCHER)
})
public class SysLogAction extends CrudActionSupport<SysLog, String>{

	@Override
	public String input() throws Exception {
		// TODO Auto-generated method stub
		return super.input();
	}
	
	@Override
	public String list() throws Exception {
		// TODO Auto-generated method stub
		return super.list();
	}
	
}
