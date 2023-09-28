package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.resources;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Product;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.services.ProductService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;


@Path("/products")
public class ProductResource {
    ProductService cusService;
    public ProductResource() {
        cusService = new ProductService();
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response insert(Product Product) {
        cusService.createProduct(Product);
        return Response.ok(Product).build();
    }





    @GET
    @Produces("application/json")
    public Response getAllAndImages() {
        List<Product> Products=cusService.getAllProducts();
        return Response.ok(Products).build();
    }



    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") long id)
    {
        if(cusService.deleteProduct(id))
        {
            return Response.ok().build();
        }
        return Response.status(Response.Status.FOUND).build();

    }





}
