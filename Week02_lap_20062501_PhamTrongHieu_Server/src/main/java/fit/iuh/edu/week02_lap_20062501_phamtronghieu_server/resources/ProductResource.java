package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.resources;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Product;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.ProductImage;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.ProductPrice;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.services.ProductService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;


@Path("/products")
public class ProductResource {
    ProductService ProService;
    public ProductResource() {
        ProService = new ProductService();
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response insert(Product Product) {
        ProService.createProduct(Product);
        return Response.ok(Product).build();
    }
    @GET
    @Produces("application/json")
    public Response getAllAndImages() {
        List<Product> Products= ProService.getAllProducts();
        return Response.ok(Products).build();
    }
    @GET
    @Path("/{id}/image")
    @Produces("application/json")
    public Response getImageByProduct(@PathParam("id") long id) {
        List<ProductImage> ProductImage= ProService.getProductImageById(id);
        return Response.ok(ProductImage).build();
    }
    @GET
    @Path("/{id}/price")
    @Produces("application/json")
    public Response getPriceByProduct(@PathParam("id") long id) {
        List<ProductPrice> ProductPrice= ProService.getProductPriceById(id);
        return Response.ok(ProductPrice).build();
    }


    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") long id)
    {
        if( ProService.deleteProduct(id))
        {
            return Response.ok().build();
        }
        return Response.status(Response.Status.FOUND).build();

    }





}
