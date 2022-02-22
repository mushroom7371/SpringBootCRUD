<%--
  Created by IntelliJ IDEA.
  User: pjh
  Date: 2022-02-21
  Time: 오후 4:00
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
    <title>조회 페이지</title>
</head>
<body>
    <h1>조회 페이지 입니다.</h1>
    <div id="index">
        <form id="frm_search" name="frm_search" method="post" action="">
            <div class='title'>
                <span class='seq'>번호</span>
                <span class='sName'>이름</span>
                <span class='sPhone'>전화번호</span>
                <span class='sDepartment'>부서</span>
            </div>

            <hr/>

            <div class='items'>
                <c:forEach var='vo' items="${viewAll}">
                    <div class='item' onclick="crud.view('${vo.sPhone}')">
                        <span class='seq'>${vo.seq }</span>
                        <span class='sName'>${vo.sName }</span>
                        <span class='sPhone'>${vo.sPhone }</span>
                        <span class='sAge'>${vo.sDepartment }</span>
                    </div>
                </c:forEach>
            </div>

            <input type="button" id="btnSearch" value="조회">

        </form>
    </div>
</body>
<script>crud.init()</script>
</html>
