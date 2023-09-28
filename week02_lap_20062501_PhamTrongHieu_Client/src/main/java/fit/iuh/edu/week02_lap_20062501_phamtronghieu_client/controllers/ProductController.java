package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.controllers;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.models.ProductModels;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.repositories.CustomerRepositories;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.ParseException;

@WebServlet(urlPatterns = {"/ProductController"})
public class ProductController extends HttpServlet {

    ProductModels productModels = new ProductModels();
    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String actions = req.getParameter("actions");
        if (actions==null) {
            productModels.getAllProduct(req,resp);
        }else if(actions.equalsIgnoreCase("delete"))
        {
            productModels.removeProduct(req,resp);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String actions = req.getParameter("actions");
        if (actions.equalsIgnoreCase("add")) {

            System.out.println("alo");
            try {
                productModels.addProduct(req,resp);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

        }




    }
}
