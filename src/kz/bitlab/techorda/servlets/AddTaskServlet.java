package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.db.DBManager;
import kz.bitlab.techorda.db.Tasks;

import java.io.IOException;

@WebServlet(value = "/add-task")
public class AddTaskServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String deadline = request.getParameter("deadline");
        long id = DBManager.getAllTasks().size();
        request.setAttribute("task_id", id);
        Tasks task = new Tasks(id, name, description, deadline, false);
        DBManager.addTask(task);

        response.sendRedirect("/");

    }
}