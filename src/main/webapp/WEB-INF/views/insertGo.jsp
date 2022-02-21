<%--
  Created by IntelliJ IDEA.
  User: pjh
  Date: 2022-02-21
  Time: 오후 1:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="/js/testJs.js" type="text/javascript"></script>
<style>
    #index form>label{
        display:inline-block;
        width:200px;
    }
</style>
<head>
    <title>저장 페이지</title>
</head>
<body>
    <h1>저장 페이지 입니다.</h1>
    <div id="index">
        <form id="frm_insert" name="frm_index" method="post" action="">
            <label>이름</label>
            <input type="text" id="Sname"/>
            <br/>
            <label>전화번호</label>
            <input type="text" id="Sphone"/>
            <br/>
            <label>부서</label>
            <input type="text" id="Sdepartment"/>
            <br/>
            <input type="button" id="btnInsert" value="저장하기"/>
            <input type="button" id="btnGoHome" value="취소"/>
        </form>
    </div>
</body>
<script>crud.init()</script>
</html>
