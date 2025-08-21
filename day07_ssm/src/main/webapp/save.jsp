<%--
  Created by IntelliJ IDEA.
  User: chu26
  Date: 2025/8/20
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="saveCommit" method="post">
    <div>姓名:<input type="text" name="name"></div>
    <div>年龄:<input type="number" name="age"></div>
    <div>性别:<input type="radio" name="gender" value="男">男
        <input type="radio" name="gender" value="女">女
    </div>
    <div>
        <button type="submit">提交</button>
    </div>
</form>
</body>
</html>

