package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.controllers;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.repositories.CustomerRepositories;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/CartController"})
public class CartController extends HttpServlet {

    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        CustomerRepositories.getCustomer();


        req.getRequestDispatcher("WEB-INF/cart.jsp").forward(req, resp);
    }
}
