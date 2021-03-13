<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>제목</th>
            <th>${boardVo.title}</th>
        </tr>
        <tr>
            <th>내용</th>
            <th>${boardVo.content}</th>
        </tr>
        <tr>
            <th>작성자</th>
            <th>${boardVo.writer}</th>
        </tr>
        <tr>
            <th>작성일</th>
            <th>${boardVo.regDate}</th>
        </tr>
        <tr>
            <th>조회수</th>
            <th>${boardVo.cnt}</th>
        </tr>
    </table>
    <a href="<c:url value="/board/edit/${boardVo.seq}"/>">수정</a>
    <a href="<c:url value="/board/delete/${boardVo.seq}"/>">삭제</a>
    <a href="<c:url value="/board/list"/>">목록</a>
</body>
</html>
