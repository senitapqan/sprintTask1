<%@ page import="kz.bitlab.techorda.db.Tasks" %>

<%--
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
  <link rel = "stylesheet" type = "text/css" href = "/css/bootstrap.css">
  <script defer src="/js/bootstrap.js"></script>
</head>
<body>


<%
  Tasks task = (Tasks)request.getAttribute("zadacha");
%>

<div class = "container mt-3">
  <%@ include file="header.jsp"%>
  <div class="mt-4"></div>
  <label for="basic-url1" class="form-label">Наименование :</label>
  <div class="input-group mb-3">
    <span class="input-group-text" ></span>
    <input type="text" name = "name" placeholder="Наименование..." class="form-control"  id="basic-url1"
           aria-describedby="basic-addon3" readonly value="<%=task.getName()%>">
  </div>
  <label class="form-label">Описание :</label>
  <div class="input-group mb-3">
    <span class="input-group-text"></span>
    <textarea class = "form-control" readonly rows = "7"><%=task.getDescription()%></textarea>
  </div>
  <label class="form-label">Выполнено :</label>
  <div class="input-group mb-3">
    <span class="input-group-text" ></span>
    <input type="text" value = "<%
                            if (task.getStatus()) {%>Да<%} else {%>Нет<%}%>"
           name = "deadline" class="form-control" aria-describedby="basic-addon3" readonly>
  </div>



  <label for="basic-url3" class="form-label">Крайний срок :</label>
  <div class="input-group mb-3">
    <span class="input-group-text" ></span>
    <input type="date" name = "deadline" class="form-control" id="basic-url3" aria-describedby="basic-addon3"
           readonly value="<%=task.getDeadlineDate()%>">
  </div>
  <a class="btn btn-success " type="submit" href="/" role="button">Сохранить</a>
  <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#editTask">
    Изменить
  </button>

  <!-- Modal -->
  <div class="modal fade" id="editTask" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
       aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <div class="modal-header">
          <h1 class="modal-title fs-5" id="staticBackdropLabel">Изменить задание</h1>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <%@include file="editTask.jsp"%>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Закрыть</button>

        </div>
      </div>
    </div>
  </div>

  <!-- Button trigger modal -->
  <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#deleteModal">
    Удалить
  </button>

  <!-- Modal -->
  <div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="deleteModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <form action="/remove-task" method="post">
          <input type="hidden" name="task_id" value="<%=task.getId()%>">
          <div class="modal-header">
            <h1 class="modal-title fs-5" id="deleteModalLabel">Удалить задание</h1>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>
          <div class="modal-body">
            Вы уверены?
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-success" data-bs-dismiss="modal">Нет</button>
            <button class="btn btn-danger">Да</button>
          </div>
        </form>
      </div>
    </div>
  </div>
</div>



</body>
</html>