<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p> <a href="/home.nhn?name=최영환">한글도 잘 되는지 확인해 봅니다.</a></p>
<p> 한글 파라미터 체크: <%=request.getParameter("name") %></p>

<form method="POST" action="/home.nhn">
이름: <input type="text" name="name" />
<input type="submit" value="확인" />
</form>
</body>
</html>
