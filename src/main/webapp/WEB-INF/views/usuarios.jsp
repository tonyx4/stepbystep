<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration - Step by Step</title>
    <style>
        body { font-family: Arial, sans-serif; padding: 30px; background-color: #f4f4f4; }
        .container { background: white; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); width: 300px; }
        input { width: 100%; padding: 8px; margin: 10px 0; border: 1px solid #ccc; border-radius: 4px; }
        button { background-color: #28a745; color: white; border: none; padding: 10px; width: 100%; cursor: pointer; border-radius: 4px; }
        button:hover { background-color: #218838; }
    </style>
</head>
<body>
<div class="container">
    <h2>New User</h2>
    <p>Fill in the Step by Step system data</p>

    <% if (request.getAttribute("mensaje") != null) { %>
    <p style="color: green; font-weight: bold;">
        <%= request.getAttribute("mensaje") %>
    </p>
    <% } %>

    <form action="/user" method="post">

        <label>Full Name:</label>
        <input type="text" name="fullName" placeholder="Ex: John Doe" required>

        <label>Email:</label>
        <input type="email" name="email" placeholder="email@example.com" required>

        <label>Role:</label>
        <input type="text" name="role" placeholder="Ex: Technician" required>

        <label>Username:</label>
        <input type="text" name="username" placeholder="Ex: jdoe" required>

        <label>Password:</label>
        <input type="password" name="password" placeholder="Enter password" required>

        <button type="submit">Save to Database</button>
    </form>
</div>
</body>
</html>