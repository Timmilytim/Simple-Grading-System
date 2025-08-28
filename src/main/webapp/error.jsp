<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Error</title>
    <style>
        body {
            margin: 0;
            font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
            background: #f8f9fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .error-container {
            text-align: center;
            background: #fff;
            padding: 40px 60px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15);
        }

        h1 {
            font-size: 2.2rem;
            color: #e63946;
            margin-bottom: 20px;
        }

        p {
            color: #555;
            font-size: 1rem;
            margin-bottom: 30px;
        }

        button {
            background: #457b9d;
            color: #fff;
            padding: 12px 24px;
            border-radius: 8px;
            font-weight: bold;
            border: none;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        button:hover {
            background: #1d3557;
        }
    </style>
</head>
<body>
<div class="error-container">
    <h1>⚠️ An Error Occurred</h1>
    <p>Something went wrong while processing your request.</p>
    <button onclick="history.back()">⬅ Go Back</button>
</div>
</body>
</html>
