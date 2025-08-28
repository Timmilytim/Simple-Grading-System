<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Register Student</title>
    <link rel="stylesheet" href="style.css">
</head>
    <body>
        <div class="form-container">
            <h2>Register Student</h2>
            <s:form action="addStudent">
                <s:textfield name="name" label="Name" cssClass="formTextField" />
                <s:textfield name="level" label="Level" cssClass="formTextField" />
                <div class="radio-group">
                    <s:radio name="gender" list="{'Male','Female'}" label="Gender" />
                </div>
                <s:textfield name="age" label="Age" cssClass="formTextField" />
                <s:submit value="Save Student" cssClass="actionBTn"/>
            </s:form>
        </div>
    </body>
</html>
