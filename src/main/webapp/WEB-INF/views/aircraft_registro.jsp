<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- Importación de clases necesarias para el manejo de fechas si fuera necesario --%>
<%@ page import="java.time.LocalDateTime" %>
<html>
<head>
    <title>Aircraft Technical Registration - Step by Step</title>
    <style>
        /* ESTRUCTURA DE DISEÑO CSS
           Mantiene la uniformidad con usuarios.jsp y workorder.jsp
        */
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            padding: 30px;
            background-color: #f4f7f6;
            color: #333;
        }
        .container {
            background: white;
            padding: 35px;
            border-radius: 12px;
            box-shadow: 0 4px 20px rgba(0,0,0,0.15);
            width: 850px;
            margin: auto;
        }
        h2 {
            text-align: center;
            color: #28a745;
            text-transform: uppercase;
            border-bottom: 2px solid #28a745;
            padding-bottom: 10px;
        }
        .instruction-header {
            text-align: center;
            font-size: 0.9em;
            color: #666;
            margin-bottom: 25px;
        }
        /* Grid para organizar los campos técnicos */
        .form-grid {
            display: grid;
            grid-template-columns: 1fr 1fr;
            gap: 15px;
        }
        .section-title {
            grid-column: span 2;
            background: #f8f9fa;
            padding: 8px 15px;
            font-weight: bold;
            color: #28a745;
            border-left: 5px solid #28a745;
            margin-top: 15px;
        }
        label {
            display: block;
            font-weight: bold;
            font-size: 0.85em;
            margin-bottom: 5px;
        }
        input, select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ced4da;
            border-radius: 5px;
            box-sizing: border-box;
        }
        input:focus {
            border-color: #28a745;
            outline: none;
            box-shadow: 0 0 5px rgba(40,167,69,0.2);
        }
        /* Estilo del botón de envío a Base de Datos */
        .btn-submit {
            background-color: #28a745;
            color: white;
            border: none;
            padding: 18px;
            width: 100%;
            cursor: pointer;
            border-radius: 6px;
            font-weight: bold;
            font-size: 1.1em;
            margin-top: 30px;
            transition: background 0.3s ease;
        }
        .btn-submit:hover {
            background-color: #218838;
        }
        .msg-success {
            background-color: #d4edda;
            color: #155724;
            padding: 15px;
            border-radius: 5px;
            text-align: center;
            margin-bottom: 20px;
            font-weight: bold;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Aircraft Registration</h2>
    <p class="instruction-header">Air Hub Step by Step - Technical Asset Management</p>

    <%-- BLOQUE DE COMENTARIO: Muestra mensaje de éxito si el controlador redirige correctamente --%>
    <% if (request.getParameter("exito") != null) { %>
    <div class="msg-success">
        ✔ Transaction Successful: Aircraft data has been persisted to the master record.
    </div>
    <% } %>

    <%-- INICIO DEL FORMULARIO TÉCNICO --%>
    <form action="/web/aircraft/guardar" method="post">

        <div class="form-grid">
            <%-- SECCIÓN: IDENTIFICACIÓN PRIMARIA --%>
            <div class="section-title">Primary Identification</div>

            <div>
                <label>Registration (Matrícula):</label>
                <input type="text" name="registration" placeholder="Ex: HK-5342" required>
            </div>
            <div>
                <label>MSN (Serial Number):</label>
                <input type="text" name="msn" placeholder="Serial Plate Number" required>
            </div>
            <div>
                <label>Model Series:</label>
                <input type="text" name="modelSeries" placeholder="Ex: King Air 350i" required>
            </div>
            <div>
                <label>Operator / Owner:</label>
                <input type="text" name="operatorOwner" placeholder="Company or Owner Name" required>
            </div>

            <%-- SECCIÓN: ESTADO TÉCNICO Y CICLOS --%>
            <div class="section-title">Technical Log & Cycles</div>

            <div>
                <label>Total Time Airframe (TTAF):</label>
                <input type="number" step="0.01" name="totalTimeAirframe" value="0.00" required>
            </div>
            <div>
                <label>Total Cycles:</label>
                <input type="number" name="totalCycles" value="0" required>
            </div>
            <div>
                <label>Airframe Cycles:</label>
                <input type="number" name="airframeCycles" value="0">
            </div>
            <div>
                <label>Engine Cycles:</label>
                <input type="number" name="engineCycles" value="0">
            </div>
            <div>
                <label>Flight Cycles:</label>
                <input type="number" name="flightCycles" value="0">
            </div>
            <div>
                <label>Aircraft Model (Year):</label>
                <input type="number" name="aircraftModel" placeholder="YYYY">
            </div>

            <%-- SECCIÓN: INFORMACIÓN DE MANTENIMIENTO --%>
            <div class="section-title">Maintenance & OEM Information</div>

            <div>
                <label>OEM Manufacturer:</label>
                <input type="text" name="oemManufacturer" placeholder="Ex: Cessna / Boeing">
            </div>
            <div>
                <label>Dash Reference:</label>
                <input type="text" name="dash" placeholder="Dash Number">
            </div>
            <div>
                <label>Customer Account ID:</label>
                <input type="number" name="customer">
            </div>
            <div>
                <label>Condition Status:</label>
                <select name="aircraftCondition">
                    <option value="Airworthy">Airworthy</option>
                    <option value="In Work">In Work</option>
                    <option value="AOG">AOG</option>
                </select>
            </div>
            <div style="grid-column: span 2;">
                <label>Maintenance Program / Type Maintenance:</label>
                <input type="text" name="typeMaintenance" placeholder="Ex: Phase 1-4 / Annual Inspection">
            </div>

            <%-- SECCIÓN: CONTROL DE FECHAS --%>
            <div class="section-title">Entry Control</div>
            <div style="grid-column: span 2;">
                <label>Date Entry (MRO Arrival):</label>
                <input type="datetime-local" name="dateEntry" required>
            </div>

        </div>

        <%-- BOTÓN DE ACCIÓN FINAL --%>
        <button type="submit" class="btn-submit">COMMIT AIRCRAFT TO DATABASE</button>

    </form>
    <%-- FIN DEL FORMULARIO --%>
</div>

</body>
</html>