<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.baizhi.cmfz.util.CookieUtil" %>
<%
	Cookie[] cookies = request.getCookies();
	if(cookies != null && cookies.length > 0) {
		String mgrName = CookieUtil.getCookieValueByName(cookies, "mgrName", "utf-8");
		request.setAttribute("mgrName", mgrName);
	}
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>持名法州后台管理中心</title>

	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="this is my page">
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">

	<link rel="icon" href="${pageContext.request.contextPath}/img/favicon.ico" type="image/x-icon" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css"></link>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath}/script/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/script/common.js"></script>
	<script type="text/javascript">

        $(function(){
            //点击更换验证码：
            $("#captchaImage").click(function(){//点击更换验证码
                $(this).attr("src", "${pageContext.request.contextPath}/getVcode?time=" + new Date().getTime());
            });
        });
	</script>
</head>
<body>

<div class="login">
	<form id="loginForm" action="${pageContext.request.contextPath}/mgr/mgrLogin" method="post" >

		<table>
			<tbody>
			<tr>
				<td width="190" rowspan="2" align="center" valign="bottom">
					<img src="${pageContext.request.contextPath}/img/header_logo.gif" />
				</td>
				<th>
					用户名:
				</th>
				<td>
					<input type="text"  name="mgrName" class="text" value="${mgrName}" maxlength="20"/>
				</td>
			</tr>
			<tr>
				<th>
					密&nbsp;&nbsp;&nbsp;码:
				</th>
				<td>
					<input type="password" name="mgrPassword" class="text" value="" maxlength="20" autocomplete="off"/>
				</td>
			</tr>

			<tr>
				<td>&nbsp;</td>
				<th>验证码:</th>
				<td>
					<input type="text" id="enCode" name="enCode" class="text captcha" maxlength="4" autocomplete="off"/>
					<img id="captchaImage" class="captchaImage" src="${pageContext.request.contextPath}/getVcode" title="点击更换验证码"/>
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
				<th>
					&nbsp;
				</th>
				<td>
					<label>
						<input name="rememberMe" type="checkbox" id="isRememberUsername" checked="checked" value="true"/> 记住用户名
					</label>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<th>&nbsp;</th>
				<td>
					<input type="button" class="homeButton" value="" onclick="location.href='${pageContext.request.contextPath}/'"><input type="submit" class="loginButton" value="登录">
				</td>
			</tr>
			</tbody></table>
		<div class="powered">COPYRIGHT © 2008-2017.</div>
		<div class="link">
			<a href="http://www.chimingfowang.com/">持名佛网首页</a> |
			<a href="http://www.chimingbbs.com/">交流论坛</a> |
			<a href="">关于我们</a> |
			<a href="">联系我们</a> |
			<a href="">授权查询</a>
		</div>
	</form>
</div>
</body>
</html>