<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html lang='ko'>
<head>
    <meta charset="UTF-8">
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <link rel='stylesheet' type='text/css' href='/css/index.css'>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src='/js/index.js'></script>
    <title>INDEX</title>
</head>
<body>

<div id='index'>
    <div id='login'>
        <jsp:include page="loginForm.jsp"/>
        <!-- 동적 삽입으로 부모페이지가 실행되어질 시점에 include한 파일이 삽입된다. -->

    </div>

    <%@include file="header.jsp" %>
    <!-- 정적 삽입으로 jsp가 컴파일되기 전에 include한 파일이 부모 페이지에 삽입되어 컴파일된다. -->

    <div id='center'>

        <div id='sub_menu'>서브메뉴</div>

        <div id='middle'>
            <div id='border'>
                <%@include file="./board/board.jsp" %>
            </div>

            <div id='????'>

            </div>
        </div>

        <div id='??'>

        </div>

    </div>
    <%@include file="footer.jsp" %>
</div>

</body>
<script>
    main.init();
</script>
</html>