<%--
  Created by IntelliJ IDEA.
  User: pjh
  Date: 2022-02-21
  Time: 오후 1:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="/js/testJs.js" type="text/javascript"></script>
<head>
    <meta charset="UTF-8">
    <title>Test</title>
</head>
<body>
    <div id="index">
        <h1>인텔리제이 스프링부트 test</h1>
        <form name = 'frm_index', id="frm_index", method="post" action="">
            <input type="button" value="조회" id="btnSearchGo">
            <input type="button" value="입력" id="btnInsertGo">
        </form>
    </div>
</body>
<script>
    crud.init();
</script>
</html>
