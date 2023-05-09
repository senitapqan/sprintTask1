package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.db.DBManager;
import kz.bitlab.techorda.db.Tasks;

import java.io.IOException;

@WebServlet(value = "/edit-task")
public class EditTaskServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String deadline = request.getParameter("deadline");
        Long id = Long.parseLong(request.getParameter("task_id"));
        Tasks task = DBManager.getTask(id);
        request.setAttribute("zadacha", task);
        boolean status = false;
        if(request.getParameter("status").equals("Да")){
            status = true;
        }
        DBManager.saveTask(new Tasks(id, name, description, deadline, status));

        request.getRequestDispatcher("details.jsp").forward(request, response);

    }
}