<@% taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core%">
<@% taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>Home</title>
    </head>
    <body>
        <h1>Koders Korner Profile Home</h1>
        <h2>Welcome ${user.getName()}</h2>
        <div class="id">
            <h3>${user.getId()}</h3>
            <h4>Name: ${user.getName()}</h4>
            <h4>Branch: ${user.getBranch()}</h4>
            <h4>Year: ${user.getYear()}</h4>
            <br>
            <h3>Achievements</h3>
            <ul>
                <c:forEach items="${user.getAchievements()}" variable="element">
                    <li>${element.name}</li>
                </c:forEach>
            </ul>
        </div>
    </body>
</html>