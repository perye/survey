package com.apsd.dwsurvey.action.nologin;

import java.util.List;

import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.SurveyDirectory;
import com.apsd.dwsurvey.entity.SurveyStats;
import com.apsd.dwsurvey.service.SurveyDirectoryManager;
import com.apsd.dwsurvey.service.SurveyStatsManager;

import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.apsd.common.utils.web.Struts2Utils;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 公开分析 action
 * @author  Perye
 *
 *
 *
 *
 */

@Namespace("/")
@InterceptorRefs({ @InterceptorRef("paramsPrepareParamsStack")})
@Results({
	@Result(name=ReportAction.DEFAULT_REPORT,location="/WEB-INF/page/content/diaowen-da/default-report-pub.jsp",type=Struts2Utils.DISPATCHER)
})
public class ReportAction extends ActionSupport{
	
	protected final static String DEFAULT_REPORT="default_report";
	
	@Autowired
	private SurveyStatsManager surveyStatsManager;
	@Autowired
	private SurveyDirectoryManager directoryManager;
	
	private SurveyStats surveyStats = new SurveyStats();
	private SurveyDirectory directory = new SurveyDirectory();
	
	private String sid;
	
	public String execute() throws Exception {
		// 得到频数分析数据
		directory=directoryManager.getSurveyBySid(sid);
		Integer viewAnswer=directory.getViewAnswer();

		if(viewAnswer!=null && viewAnswer.intValue()==1){
			List<Question> questions = surveyStatsManager.findFrequency(directory);
			surveyStats.setQuestions(questions);
		}else{
			Struts2Utils.getRequest().setAttribute("noview", 1);
		}
		return DEFAULT_REPORT;		
	}
	
	public SurveyStats getSurveyStats() {
		return surveyStats;
	}
	
	public SurveyDirectory getDirectory() {
		return directory;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	
}
