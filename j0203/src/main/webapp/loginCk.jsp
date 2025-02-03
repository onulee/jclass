<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키저장하기</title>
	</head>
	<body>
	<!-- 아이디를 쿠키에 저장 하기 변수명:cook_id 변수값: 입력데이터  -->
	<%
	    String id = request.getParameter("id");
	    String[] saveId = request.getParameterValues("saveId");
	    if(saveId != null) {
	    	Cookie cookie = new Cookie("cook_id",id); //쿠키객체생성
		    cookie.setMaxAge(60*60*24*365); // 60초 * 60분 * 24시간 *365일 (1년)
		    response.addCookie(cookie);
	%>	    
        <div><%= saveId[0] %> (가)이 저장되었습니다.</div>
	    <%}else{
	    	Cookie[] cookies = request.getCookies();
	    	for(Cookie cookie : cookies){
	    		if(cookie.getName().equals("cook_id")){
	    			cookie.setMaxAge(0);
	    			response.addCookie(cookie);
	    		}
	    	}
	    %>
	    <div>쿠키에 저장되어 있는 cook_id (가)이 삭제 되었습니다.</div>
	    <%} %>
   
    <div>정보 : <%= saveId %></div>
	
	<button onclick="javascript:location.href='loginOk.jsp'">이동하기</button>
	
	
	
	
	
	</body>
</html>