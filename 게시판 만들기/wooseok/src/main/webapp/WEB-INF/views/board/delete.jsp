<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
    <form name="deleteForm" action="<c:url value="/board/delete"/>" method="post">
        <input name="seq" value="${seq}"/>
        비밀번호<input name="pwd"/>
        <input type="submit"/>
        <a href="<c:url value="/board/read/${seq}" />">취소</a>
    </form>
    <div>${msg}</div>
</body>
</html>
