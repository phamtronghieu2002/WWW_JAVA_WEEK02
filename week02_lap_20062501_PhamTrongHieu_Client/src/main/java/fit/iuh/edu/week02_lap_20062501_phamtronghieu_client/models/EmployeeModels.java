package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.models;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities.Employee;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.enums.EmployeeStatus;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.repositories.EmployeeRepositories;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class EmployeeModels extends HttpServlet {



    public EmployeeModels(){

    }

    public void getAllEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        req.setAttribute("employees", EmployeeRepositories.getEmployees());
        req.getRequestDispatcher("WEB-INF/pages/ManagerEmployee.jsp").forward(req, resp);
    }


    public void addEmployee(HttpServletRequest req, HttpServletResponse resp) throws IOException, ParseException {

        String fullName = req.getParameter("full_name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String dob = req.getParameter("dob");

       Date dt = new SimpleDateFormat("yyyy-MM-dd")
                .parse(dob);


            Employee employee = new Employee(fullName, email, phone, address, new Date(dt.getTime()),EmployeeStatus.ACTIVE);



        EmployeeRepositories.createEmployee(employee);
//
        resp.sendRedirect("EmployeeController");


    }

    public void removeEmployee(HttpServletRequest req, HttpServletResponse resp) {


            try {
                int id = Integer.parseInt(req.getParameter("empId"));
                EmployeeRepositories.deleteEmployee(id);
                resp.sendRedirect("EmployeeController");
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
