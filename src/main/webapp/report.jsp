<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Report</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="report-header">
        <h2><s:property value="name"/>'s Report (<s:property value="level"/>)</h2>
        <p>Age: <s:property value="age"/> | Gender: <s:property value="gender"/></p>
    </div>

    <table class="reportTable">
        <tr>
            <th>Subject</th>
            <th>Score</th>
            <th>Grade</th>
        </tr>
        <tr><td>Java</td><td><s:property value="java"/></td><td><s:property value="javaGrade"/></td></tr>
        <tr><td>Python</td><td><s:property value="python"/></td><td><s:property value="pythonGrade"/></td></tr>
        <tr><td>PHP</td><td><s:property value="php"/></td><td><s:property value="phpGrade"/></td></tr>
        <tr><td>JavaScript</td><td><s:property value="javascript"/></td><td><s:property value="javascriptGrade"/></td></tr>
        <tr><td>HTML</td><td><s:property value="html"/></td><td><s:property value="htmlGrade"/></td></tr>
    </table>

    <div class="report-summary">
        <h3>CGPA: <s:property value="cgpa"/></h3>
        <h3>Remark: <s:property value="remark"/></h3>
    </div>
    <div align="center">
        <button onclick="history.back()" style="width: 10%" class="actionBTn">Go back</button>
    </div>
</body>

</html>
