package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.services;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.enums.ProductStatus;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Product;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.repositories.ProductRepository;

import java.util.List;

public class ProductService {

    private final ProductRepository ProductDao;

    public ProductService() {
        ProductDao = new ProductRepository(Product.class);
    }

    public void createProduct(Product Product) {
        ProductDao.create(Product);
    }

    public void updateProduct(Product Product) {
        ProductDao.update(Product);
    }

    public boolean deleteProduct(long ProductId) {
      return ProductDao.updateStatus(ProductId, ProductStatus.NOT_ACTIVE);
    }

    public Product getProductById(int ProductId) {
        return ProductDao.findById(ProductId);
    }

    public List<Product> getAllProducts() {
        return ProductDao.findAll();
    }

    public List<Product> getAllProduct() {
        return this.ProductDao.getProducts();
    }



}
