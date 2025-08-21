<%@ page import="com.xzit.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: chu26
  Date: 2025/8/20
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, td {
            border: 1px solid black;
            border-collapse: collapse;
        }

        table {
            margin: 0 auto;
            text-align: center;
            width: 700px;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
        <td>操作</td>
    </tr>
    <%
        List<Student> list = (List<Student>) request.getAttribute("list");
        int x = 1;
        for (Student student : list) { %>
    <tr>
        <td><%=x++%>
        </td>
        <td><%=student.getName()%>
        </td>
        <td><%=student.getAge()%>
        </td>
        <td><%=student.getGender()%>
        </td>
        <td><a href="javascript:;"
               onclick="doDel(<%=student.getId()%>)">删除数据</a>
            <a href="javascript:;"
               onclick="doUpdate(<%=student.getId()%>)">修改数据</a>
        </td>
    </tr>
    <% }
    %>
</table>
</body>
<script>
    function doDel(id) {
        if (confirm("确定删除吗?"))
            location = "delete/" + id

    }

    function doUpdate(id) {
        location = "update/form/" + id
    }
</script>
</html>
