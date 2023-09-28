package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.repositories;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.enums.EmployeeStatus;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.enums.ProductStatus;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Employee;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Product;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ProductRepository  extends  CRUD_GENERIC<Product>{




    public ProductRepository(Class<Product> cus) {
        super(cus);
    }

    //get all product
    public List<Product> getProducts() {
        TypedQuery<Product> query = em.createQuery(
                "SELECT p FROM Product p", Product.class);
        return query.getResultList();
    }

    public boolean updateStatus(long id, ProductStatus status) {
        Product product= findById(id);

        if (product != null) {
            product.setStatus(status);
            update(product);
            return true;
        }
        return false;
    }












}
