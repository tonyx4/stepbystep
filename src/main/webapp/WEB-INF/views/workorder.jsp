<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Work Order - Step by Step</title>
    <style>
        body { font-family: Arial, sans-serif; padding: 30px; background-color: #f4f4f4; }
        .container { background: white; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); width: 400px; margin: auto; }
        input, select { width: 100%; padding: 8px; margin: 10px 0; border: 1px solid #ccc; border-radius: 4px; box-sizing: border-box; }
        button { background-color: #007bff; color: white; border: none; padding: 10px; width: 100%; cursor: pointer; border-radius: 4px; font-weight: bold; }
        button:hover { background-color: #0056b3; }
        label { font-weight: bold; font-size: 0.9em; }
    </style>
</head>
<body>
<div class="container">
    <h2>New Work Order</h2>
    <p>Create a Work Order</p>

    <form action="/workorders-form/guardar" method="post">

    <label>WO Internal Number:</label>
    <input type="text" name="woNumberInternal" required>

    <label>WO External Number:</label>
    <input type="text" name="woNumberExternal" required>

    <label>Customer PO:</label>
    <input type="text" name="customerPo">

    <label>Aircraft ID:</label>
    <input type="number" name="aircraftId" required>

    <label>Component ID:</label>
    <input type="number" name="componentId">

    <label>Service Type:</label>
    <input type="text" name="serviceType" required>

    <label>Priority:</label>
    <select name="priority">
        <option value="Routine">Routine</option>
        <option value="Urgent">Urgent</option>
        <option value="AOG">AOG</option>
    </select>

    <label>Entry Cycles:</label>
    <input type="number" name="entryCycles" required>

    <label>Date Received External:</label>
    <input type="date" name="dateReceivedExternal" required>

    <label>Lead Technician ID:</label>
    <input type="number" name="leadTechnicianId" required>

    <label>Inspector RIII ID:</label>
    <input type="number" name="inspectorRiiiId">

    <label>Customer Representative:</label>
    <input type="text" name="customerRepresentative">

    <label>Work Scope Summary:</label>
    <input type="text" name="workScopeSummary" required>

    <button type="submit">Save Work Order</button>

    </form>
</div>
</body>
</html>