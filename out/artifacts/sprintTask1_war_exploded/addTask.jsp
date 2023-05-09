<%@ page import="kz.bitlab.techorda.db.DBManager" %><%--
  Created by IntelliJ IDEA.
  User: 77782
  Date: 09.05.2023
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>





<form action = '/add-task' method = 'POST'>
    <label for="basic-url1" class="form-label">Наименование :</label>
    <div class="input-group mb-3">
        <span class="input-group-text" ></span>
        <input type="text" name = "name" class="form-control"  placeholder="Наименование..." id="basic-url1" aria-describedby="basic-addon3" required>
    </div>
    <label class="form-label">Описание :</label>
    <div class="input-group mb-3">
        <span class="input-group-text"></span>
        <textarea name="description" class = "form-control" rows="7"></textarea>
    </div>
    <label for="basic-url3" class="form-label">Крайний срок :</label>
    <div class="input-group mb-3">
        <span class="input-group-text" ></span>
        <input type="date" name = "deadline" class="form-control" id="basic-url3" aria-describedby="basic-addon3" required>
    </div>
    <button class="btn btn-primary" type="submit">Добавить</button>

</form>



</body>
</html>
