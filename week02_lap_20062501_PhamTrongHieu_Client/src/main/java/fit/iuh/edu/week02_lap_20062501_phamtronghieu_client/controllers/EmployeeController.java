package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.controllers;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.models.EmployeeModels;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.repositories.CustomerRepositories;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.ParseException;

@WebServlet(urlPatterns = {"/EmployeeController"})
public class EmployeeController extends HttpServlet {

    EmployeeModels employeeModels = new EmployeeModels();
    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String actions = req.getParameter("actions");
        if (actions==null) {

            employeeModels.getAllEmployee(req,resp);
        }else if(actions.equalsIgnoreCase("delete"))
        {
            employeeModels.removeEmployee(req,resp);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String actions = req.getParameter("actions");
if (actions.equalsIgnoreCase("add")) {

    try {
        System.out.println("alo");
        employeeModels.addEmployee(req,resp);

    } catch (ParseException e) {
        throw new RuntimeException(e);
    }
}




    }
}
