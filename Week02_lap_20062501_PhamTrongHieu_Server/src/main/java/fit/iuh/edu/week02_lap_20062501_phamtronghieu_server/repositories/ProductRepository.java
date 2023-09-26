package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.repositories;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Product;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ProductRepository  extends  CRUD_GENERIC<Product>{




    public ProductRepository(Class<Product> cus) {
        super(cus);
    }

    //get all product
    public List<Product> getProductsAndImages() {
        String jpql = "SELECT p FROM Product p INNER JOIN  p.images";
        TypedQuery<Product> query = em.createQuery(jpql, Product.class);
        System.out.println(query.getResultList());
        return query.getResultList();
    }
















}
