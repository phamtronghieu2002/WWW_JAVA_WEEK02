package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.resources;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Employee;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.services.EmployeeService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;


@Path("/employees")
public class EmployeeResource {
    EmployeeService cusService;
    public EmployeeResource() {
        cusService = new EmployeeService();
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response insert(Employee Employee) {
        cusService.createEmployee(Employee);
        return Response.ok(Employee).build();
    }
    @GET
    @Produces("application/json")
    public Response getAll() {
        List<Employee> Employees=cusService.getAllEmployees();
        System.out.println(Employees);
        return Response.ok(Employees).build();
    }



    @DELETE
    @Produces("application/json")
    @Path("/{id}")
    public Response delete(@PathParam("id") int id)
    {
        System.out.println(id);
        if(cusService.DeleteEm(id))
        {
            return Response.ok().build();
        }
        return Response.status(Response.Status.FOUND).build();

    }





}
