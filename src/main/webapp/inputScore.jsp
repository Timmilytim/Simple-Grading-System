<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Record Scores</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="form-container">
        <h2>Record Scores</h2>
        <s:form action="updateScoreAction">
            <s:hidden name="id"/>
            <s:textfield name="java" label="Java" class="formTextField" />
            <s:textfield name="python" label="Python" class="formTextField" />
            <s:textfield name="php" label="Php" class="formTextField" />
            <s:textfield name="javascript" label="Javascript" class="formTextField" />
            <s:textfield name="html" label="HTML" class="formTextField" />
            <s:submit value="Record" class="actionBTn"/>
        </s:form>
    </div>
</body>
</html>
