package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.services;

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

    public boolean deleteProduct(Long ProductId) {
        Product Product = ProductDao.findById(ProductId);
        if (Product != null) {
         return   ProductDao.delete(Product);
        }
        return false;
    }

    public Product getProductById(int ProductId) {
        return ProductDao.findById(ProductId);
    }

    public List<Product> getAllProducts() {
        return ProductDao.findAll();
    }

    public List<Product> getAllProductsAndImages() {
        return this.ProductDao.getProductsAndImages();
    }



}
