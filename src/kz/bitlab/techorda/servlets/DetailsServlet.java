package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.db.DBManager;
import kz.bitlab.techorda.db.Tasks;

import java.io.IOException;

@WebServlet(value = "/details")
public class DetailsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("task_id"));
        Tasks task = DBManager.getTask(id);

        request.setAttribute("zadacha", task);
        request.getRequestDispatcher("/details.jsp").forward(request, response);

    }
}