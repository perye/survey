<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@include file="/common/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><sitemesh:write property='title' />&nbsp;&nbsp;lyun</title>

<link href="https://cdn.bootcss.com/jqueryui/1.11.0/jquery-ui.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/jquery/1.10.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/jqueryui/1.10.3/jquery-ui.min.js"></script>
<script type="text/javascript" src="${ctx }/js/dw/responsive-width.js"></script>
<script language="javascript" type="text/javascript" src="${ctx }/js/plugs/My97DatePickerBeta/My97DatePicker/WdatePicker.js"></script>
<sitemesh:write property='head' />
<link href="${ctx }/css/dw-user.css" rel="stylesheet" type="text/css" />
<link rel="icon" href="/favicon.ico" type="image/x-icon" />
</head>
<body>
<div id="wrap" >
	<input type="hidden" id="ctx" name="ctx" value="${ctx }">
	<%@ include file="/WEB-INF/page/layouts/header.jsp"%>
	<sitemesh:write property='body' />
	
	
	<div class="dw_foot" style="padding-top:20px;">
		<%@ include file="/WEB-INF/page/layouts/footer-1.jsp"%>

		<div class="footer-copyright" style="color: gray;padding-top: 0px;font-size: 16px;padding-bottom: 16px;">
			Powered by <a href="http://www.lyun.edu.cn/" style="text-decoration: none;" rel="external">lyun</a>
		</div>
	</div>
	
	
	</div>
	<%@ include file="/WEB-INF/page/layouts/other.jsp"%>
<script type="text/javascript">
	resizeBodyWidth();
</script>
</body>
</html>