package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.services;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.ProductImage;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.repositories.ProductImageRepository;

import java.util.List;

public class ProductImageService {

    private final ProductImageRepository ProductImageDao;

    public ProductImageService() {
        ProductImageDao = new ProductImageRepository(ProductImage.class);
    }

    public void createProductImage(ProductImage ProductImage) {
        ProductImageDao.create(ProductImage);
    }

    public void updateProductImage(ProductImage ProductImage) {
        ProductImageDao.update(ProductImage);
    }

    public void deleteProductImage(int ProductImageId) {
        ProductImage ProductImage = ProductImageDao.findById(ProductImageId);
        if (ProductImage != null) {
            ProductImageDao.delete(ProductImage);
        }
    }

    public ProductImage getProductImageById(int ProductImageId) {
        return ProductImageDao.findById(ProductImageId);
    }

    public List<ProductImage> getAllProductImages() {
        return ProductImageDao.findAll();
    }

}
