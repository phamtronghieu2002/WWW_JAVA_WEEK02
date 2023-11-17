package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.controllers;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities.Product;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.repositories.CustomerRepositories;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.repositories.ProductRepositories;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/CartController"})
public class CartController extends HttpServlet {

    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object obj = session.getAttribute("carts");
        List<Product> carts = null;
        if (obj == null) {
            carts  = new ArrayList<>();
        }
else {
            carts = (List<Product>) obj;
        }
        String action = req.getParameter("action");

        if (action != null && action.equalsIgnoreCase("addToCart")) {

            long id = Long.parseLong(req.getParameter("id"));
            ArrayList<Product> products = ProductRepositories.getProducts();
            Product product = null;
            for (Product p : products) {
                if (p.getProductId() == id) {
                    product = p;
                    break;
                }
            }
            if (!carts.contains(product)) {

                carts.add(product);

                session.setAttribute("carts", carts);
            }

//            req.getRequestDispatcher("WEB-INF/pages/cart.jsp").forward(req, resp);

            resp.sendRedirect("index.jsp");
    }else if(action != null && action.equalsIgnoreCase("viewCart"))
        {


            req.setAttribute("carts", carts);
            req.getRequestDispatcher("WEB-INF/pages/cart.jsp").forward(req, resp);
        }else if(action != null && action.equalsIgnoreCase("deleteCart"))
        {

            long id = Long.parseLong(req.getParameter("id"));
            ArrayList<Product> products = ProductRepositories.getProducts();
            Product product = null;
            for (Product p : products) {
                if (p.getProductId() == id) {
                    product = p;
                    break;
                }
            }
            if (carts.contains(product)) {

                carts.remove(product);

                session.setAttribute("carts", carts);
            }

            resp.sendRedirect("CartController?action=viewCart");


        }

}}
