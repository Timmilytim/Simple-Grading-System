<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div align="center">
        <h1>Welcome to the Dashboard</h1>
        <a href="register.jsp">
            <button class="actionBTn2">Register Student</button>
        </a>
    </div>

    <table class="studentTable" width="750">
        <thead>
        <tr>
            <th>Name</th>
            <th>Class</th>
            <th>Age</th>
            <th>Gender</th>
            <th colspan="4">Actions</th>
        </tr>
        </thead>

        <s:iterator value="students" var="student">
            <tr>
                <td>
                    <s:property value="#student.name"/>
                </td>
                <td>
                    <s:property value="#student.level"/>
                </td>
                <td>
                    <s:property value="#student.age"/>
                </td>
                <td>
                    <s:property value="#student.gender"/>
                </td>
                <td>
                    <a href="updateStudentData?id=<s:property value="#student.id"/>">
                        <button class="actionBTN">Update</button>
                    </a>
                </td>
                <td>
                    <a href="updateScoreData?id=<s:property value="#student.id"/>">
                         <button class="actionBTN">Record Score</button>
                    </a>
                </td>
                <td>
                    <a href="reportAction?id=<s:property value="#student.id"/>">
                        <button class="actionBTN">Check Report</button>
                    </a>
                </td>
                <td>
                    <a href="deleteStudentAction?id=<s:property value="#student.id"/>">
                        <button style="background-color: #e74c3c" class="actionBTN">Delete</button>
                    </a>
                </td>
            </tr>
        </s:iterator>
</body>
</html>
