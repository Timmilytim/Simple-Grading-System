<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div align="center">
        <h2>TIM SCHOOLS PORTAL</h2>
        <s:form action="loginAction">
            <s:textfield name="userName" label="Username" class="formTextField" />
            <s:password name="password" label="Password" class="formTextField" />
            <s:submit value="Login" class="actionBTn"/>
        </s:form>
    </div>
</body>
</html>
