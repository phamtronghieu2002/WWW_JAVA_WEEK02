package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.models;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities.Product;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.enums.ProductStatus;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.repositories.ProductRepositories;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductModels extends HttpServlet {


    public void getAllProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

System.out.println("alo alo >>>"+ProductRepositories.getProducts());

        req.setAttribute("products", ProductRepositories.getProducts());
        req.getRequestDispatcher("WEB-INF/pages/ManagerProduct.jsp").forward(req, resp);
    }


    public void addProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException, ParseException {


        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String unit = req.getParameter("unit");
        String manufacturerName = req.getParameter("manufacturerName");




        ProductRepositories.createProduct(new Product(name,description,unit,manufacturerName, ProductStatus.ACTIVE));
//
        resp.sendRedirect("ProductController");


    }

    public void removeProduct(HttpServletRequest req, HttpServletResponse resp) {

      System.out.println(req.getParameter("id"));
        try {
            long id = Long.parseLong(req.getParameter("id"));
            ProductRepositories.deleteProduct(id);
            resp.sendRedirect("ProductController");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
