<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration - Step by Step</title>
    <style>
        body { font-family: Arial, sans-serif; padding: 30px; background-color: #f4f4f4; }
        /* Aumenté un poco el width a 400px para que los campos nuevos quepan bien */
        .container { background: white; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); width: 400px; margin: auto; }
        input, select { width: 100%; padding: 8px; margin: 10px 0; border: 1px solid #ccc; border-radius: 4px; box-sizing: border-box; }
        button { background-color: #28a745; color: white; border: none; padding: 10px; width: 100%; cursor: pointer; border-radius: 4px; font-weight: bold; }
        button:hover { background-color: #218838; }
        label { font-weight: bold; font-size: 0.9em; }
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

    <form action="/users/guardar" method="post">

        <label>Full Name:</label>
        <input type="text" name="fullName" placeholder="Ex: John Doe" required>

        <label>Email:</label>
        <input type="email" name="email" placeholder="email@example.com" required>

        <label>Role:</label>
        <input type="text" name="role" placeholder="Ex: Technician / Inspector" required>

        <label>License Number:</label>
        <input type="text" name="licenseNumber" placeholder="Ex: LMA-12345" required>

        <label>License Expiry:</label>
        <input type="date" name="licenseExpiry" required>

        <label>Inspector Seal (RII):</label>
        <input type="text" name="inspectorSeal" placeholder="Ex: RII-99">

        <label>Specialty:</label>
        <select name="specialty">
            <option value="Airframe">Airframe</option>
            <option value="Powerplant">Powerplant</option>
            <option value="Avionics">Avionics</option>
            <option value="Structures">Structures</option>
        </select>

        <hr> <label>Username:</label>
        <input type="text" name="username" placeholder="Ex: jdoe" required>

        <label>Password:</label>
        <input type="password" name="password" placeholder="Enter password" required>

        <button type="submit">Save to Database</button>
    </form>
</div>
</body>
</html>