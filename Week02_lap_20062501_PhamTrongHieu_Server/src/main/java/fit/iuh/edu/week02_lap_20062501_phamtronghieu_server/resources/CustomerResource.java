package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.resources;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Customer;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.services.CustomerService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;


@Path("/customers")
public class CustomerResource {
    CustomerService cusService;
    public CustomerResource() {
       cusService = new CustomerService();
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response insert(Customer customer) {
        cusService.createCustomer(customer);
        return Response.ok(customer).build();
    }


    @GET
    @Produces("application/json")
    public Response getAll() {
        List<Customer> customers=cusService.getAllCustomers();
        return Response.ok(customers).build();
    }



    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") long id)
    {
        if(cusService.deleteCustomer(id))
        {
            return Response.ok().build();
        }
        return Response.status(Response.Status.FOUND).build();

    }





}
