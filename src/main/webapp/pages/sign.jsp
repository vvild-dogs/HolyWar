<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: rocks
  Date: 08.08.2016
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="Dobrovoimaster">
    <!--Icon project-->
    <link rel="icon" href="<c:url value="https://cdn4.iconfinder.com/data/icons/adiante-apps-app-templates-incos-in-grey/512/app_type_ngo_512px_GREY.png"/>">
    <!--File CSS-->
    <link href="<c:url value="/resources/css/menu.css"/>" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/grid.css"/>" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet"/>
    <!--bootstrap icon-->
    <link href="<c:url value="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css"/>" rel="stylesheet"/>
    <link href="<c:url value="https://fonts.googleapis.com/css?family=Lobster"/>" rel='stylesheet' type='text/css'/>
</head>
<body>
<div class="header"><div class="name">Жопарвач</div></div>
<input class="open" id="top-box" type="checkbox" hidden>
<label class="btn" for="top-box"></label>
<div class="top-panel">
    <a href=""><button class="btnmenu">Главная</button></a>
    <button class="btnmenu">Топчик</button>
    <button class="btnmenu">Личный кабинет</button>
    <button class="btnmenu">Помощь</button>
    <a href=""><button class="btnmenu">Регистрация</button></a>
    <a href=""><button class="btnmenu">Вход</button></a>
</div>
<div class="content">
    <div class="sig clock">
        <sec:authorize access="!isAuthenticated()">
            <h1>Вход</h1>
            <c:url value="/j_spring_security_check" var="loginUrl" />
            <form action="${loginUrl}" method="post">
                <input type="text" class="form-control" name="j_username" placeholder="Email address" required autofocus>
                <input type="password" class="form-control" name="j_password" placeholder="Password">
                <button class="reglogbtn" type="submit">Войти</button>
            </form>
        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
            <p>Логин: <sec:authentication property="principal.username" /></p><br>
            <a class="reglogbtn" href="/logout" role="button">Выйти</a>
        </sec:authorize>
    </div>
</div>
</body>
</html>
