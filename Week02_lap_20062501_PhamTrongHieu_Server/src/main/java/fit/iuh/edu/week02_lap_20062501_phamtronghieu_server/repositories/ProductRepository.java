package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.repositories;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.enums.EmployeeStatus;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.enums.ProductStatus;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Employee;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Product;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.ProductImage;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.ProductPrice;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ProductRepository  extends  CRUD_GENERIC<Product>{




    public ProductRepository(Class<Product> cus) {
        super(cus);
    }

    public List<ProductImage> getProductImageById(long id)
    {
        String sql ="select pi from ProductImage pi join Product p on pi.product.productId=p.productId where p.productId=:id";
        Query query= em.createQuery(sql);
        query.setParameter("id",id);
        return query.getResultList();




    }

    public List<ProductPrice> getProductPricebyId(long id)
    {
        String sql ="select pprice from ProductPrice pprice join Product p on pprice.product.productId=p.productId where p.productId=:id";
        Query query= em.createQuery(sql);
        query.setParameter("id",id);
        return query.getResultList();




    }
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
