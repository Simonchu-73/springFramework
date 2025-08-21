<%@ page import="com.xzit.model.Student" %><%--
  Created by IntelliJ IDEA.
  User: chu26
  Date: 2025/8/20
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Student student = (Student) request.getAttribute("student");
%>
<form action="/day07_ssm_war_exploded/updateCommit" method="post">
    <input type="hidden" name="id" value="<%=student.getId()%>">
    <div>姓名:<input type="text" name="name" value="<%=student.getName()%>"></div>
    <div>年龄:<input type="number" name="age" value="<%=student.getAge()%>"></div>
    <div>性别:
        <input type="radio" name="gender" value="男" <%= "男".equals(student.getGender()) ? "checked" : "" %>>男
        <input type="radio" name="gender" value="女" <%= "女".equals(student.getGender()) ? "checked" : "" %>>女
    </div>
    <div>
        <button type="submit">提交</button>
    </div>
</form>
</body>
</html>
