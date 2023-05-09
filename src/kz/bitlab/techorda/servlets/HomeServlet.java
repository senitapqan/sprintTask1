package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.db.DBManager;
import kz.bitlab.techorda.db.Tasks;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/home.html")
public class HomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ArrayList <Tasks> tasks = DBManager.getAllTasks();
        System.out.println(tasks.size());

        request.setAttribute("zadachi", tasks);
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
    public void doPost(HttpServlet request, HttpServlet response) throws ServletException, IOException {

    }
}