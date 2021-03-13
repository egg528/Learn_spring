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
<form:form modelAttribute="boardVo">
    <table border="1">
        <thead>
        <tr>
            <th>게시판 글쓰기 양식</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><form:input path="title" placeholder="글 제목"></form:input></td>
        </tr>
        <tr>
            <td><form:input path="content" placeholder="내용"></form:input></td>
        </tr>
        <tr>
            <td><form:input path="writer" placeholder="작성자"></form:input></td>
        </tr>
        <tr>
            <td>
                <input path="password" id="pwd" name="pwd" placeholder="비밀번호"/>
                ${msg}
            </td>
        </tr>
        </tbody>
    </table>
    <input type="submit" vlaue="수정">
    <a href="<c:url value="/board/list"/>">목록</a>
</form:form>
</body>
</html>