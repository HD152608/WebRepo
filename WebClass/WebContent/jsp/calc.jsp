<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "java.text.SimpleDateFormat, java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>숫자 합 계산</title>
</head>
<body>
	<form>
		<input type="number" name="num" min="1" required>
		<button type="submit">계산</button>
	</form>
	<%-- 스크립틀릿 tag로 1~입력받은 숫자까지의 합 구하기 --%>
	<%-- 결과 출력 시 변수 값은 표현식 tag로 작성하기 (jsp 파일 로딩시에는 보이지 않음) --%>
	<%
		String num = request.getParameter("num");
		int i, sum = 0;
		if (num == null)
			num = null;
		else if (num != null) {
			int number = Integer.parseInt(num);
			for (i = 1; i <= number; i++) {
				sum += i;
			}
		}
	%>
	<% if(num != null){ %>
	 
	<h1>1 ~ <%=num%>까지의 합은 <%=sum %>입니다.</h1>
	
	<%
	
	}
	// 현재 일시 구하기
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss a");
	%>
	현재일시는 <%= sdf.format(new Date()) %>
	
	<%-- 쌤 답
	String num = request.getParameter("num");
	int sum=0;
	if(num != null){
		for(int i=1; i<=Integer.parseInt(num); i++){
			sum+=i;
	}
	 --%>
	 
	 
</body>
</html>