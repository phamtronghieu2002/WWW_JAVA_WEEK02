package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.services;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.ProductPrice;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.repositories.ProductPriceRepository;

import java.util.List;

public class ProductPriceService {

    private final ProductPriceRepository ProductPriceDao;

    public ProductPriceService() {
        ProductPriceDao = new ProductPriceRepository(ProductPrice.class);
    }

    public void createProductPrice(ProductPrice ProductPrice) {
        ProductPriceDao.create(ProductPrice);
    }

    public void updateProductPrice(ProductPrice ProductPrice) {
        ProductPriceDao.update(ProductPrice);
    }

    public void deleteProductPrice(int ProductPriceId) {
        ProductPrice ProductPrice = ProductPriceDao.findById(ProductPriceId);
        if (ProductPrice != null) {
            ProductPriceDao.delete(ProductPrice);
        }
    }

    public ProductPrice getProductPriceById(int ProductPriceId) {
        return ProductPriceDao.findById(ProductPriceId);
    }

    public List<ProductPrice> getAllProductPrices() {
        return ProductPriceDao.findAll();
    }





}
