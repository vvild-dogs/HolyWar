<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <meta name="author" content="Dobrovoimaster">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--Icon project-->
    <link rel="icon" href="<c:url value="https://cdn4.iconfinder.com/data/icons/adiante-apps-app-templates-incos-in-grey/512/app_type_ngo_512px_GREY.png"/>">
    <!--File CSS-->
    <link href="<c:url value="/resources/css/menu.css"/>" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/grid.css"/>" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet"/>
    <!--bootstrap icon-->
    <link href="<c:url value="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css"/>" rel="stylesheet"/>
    <link href="<c:url value="https://fonts.googleapis.com/css?family=Lobster"/>" rel='stylesheet' type='text/css'/>
    <title>Регистрация</title>
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
<div class="row">
    <div class="col-xs-10 col-xs-offset-1 col-md-4 col-md-offset-4">
        <h1 class="center">Регистрация</h1>
        <form action="register/userMeta" method="post">
            <div><input placeholder="Кликуха" name="userName" class="regloginp" type="text"/></div>
            <!--div><input placeholder="Мыло" class="regloginp" type="text"/></div>-->
            <div><input placeholder="Пароль" name="password" class="regloginp" type="password"/></div>
            <!--<div><input placeholder="Повтор пароля" class="regloginp" type="password"/></div>-->
            <div><button type="submit" class="reglogbtn">зарегистрироваться</button></div>
        </form>
    </div>
</div>
</body>
</html>
