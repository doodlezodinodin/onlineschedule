<#--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>-->

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Главная страница</title>
</head>
<body>
<div><h1>Расписание онлайн</h1></div>
<div><h3>Расписание твоего учебного заведения города Северодонецк онлайн.</h3></div>

<div>
    <form action="searchPage" name="" method="post">
        <select name="namePage" id="" title="">
                <#list listInstitution as institution>
                    <option value="${institution.value}">${institution.nameInstitution}</option>
                </#list>
        </select>
        <input type="submit" value="Найти">
    </form>
</div>

<br><br><br><br><br><br>

<div><p>oleksandrhrankin</p></div>
</body>
</html>