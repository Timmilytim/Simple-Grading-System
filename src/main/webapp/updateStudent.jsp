<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Update Student Record</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="form-container">
        <h2>Update Student Record</h2>
        <s:form action="updateStudentAction">
            <s:hidden name="id"/>
            <s:textfield name="name" label="Name" class="formTextField" />
            <s:textfield name="level" label="Level" class="formTextField" />
            <div class="radio-group">
                <s:radio name="gender" list="{'Male','Female'}" label="Gender" />
            </div>
            <s:textfield name="age" label="Age" class="formTextField" />
            <s:submit value="Update" class="actionBTn"/>
        </s:form>
    </div>
</body>
</html>
