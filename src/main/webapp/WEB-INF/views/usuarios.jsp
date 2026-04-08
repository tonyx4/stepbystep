<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro de Usuarios - Step by Step</title>
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
        <h2>Nuevo Usuario</h2>
        <p>Completa los datos del proyecto Step by Step</p>

        <% if (request.getAttribute("mensaje") != null) { %>
            <p style="color: green; font-weight: bold;">
                <%= request.getAttribute("mensaje") %>
            </p>
        <% } %>

        <form action="/usuarios/guardar" method="post">
            <label>Nombre:</label>
            <input type="text" name="nombre" placeholder="Ej: Melfry Moreno" required>

            <label>Correo:</label>
            <input type="email" name="correo" placeholder="correo@ejemplo.com" required>

            <label>Cargo:</label>
            <input type="text" name="cargo" placeholder="Ej: Desarrollador" required>

            <label>Username:</label>
            <input type="text" name="username" placeholder="Ej: mmoreno" required>

            <label>Password:</label>
            <input type="password" name="password" placeholder="Ingrese contraseña" required>

            <button type="submit">Guardar en Base de Datos</button>
        </form>
    </div>
</body>
</html>