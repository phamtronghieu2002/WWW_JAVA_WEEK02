package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.enums.ProductStatus;

import java.util.ArrayList;
import java.util.List;


public class Product {


    private Long productId;


    private String name;


    private String description;


    private String unit;


    private String manufacturerName;


        private ProductStatus productStatus;
     private ArrayList<ProductImage> images;
     private  ArrayList<ProductPrice> prices;


    public Product() {
    }




    public Product(Long productId, String name, String description, String unit, String manufacturerName, ProductStatus productStatus) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.productStatus = productStatus;
    }
    public Product( String name, String description, String unit, String manufacturerName, ProductStatus productStatus) {

        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.productStatus = productStatus;
    }
    // Getters and setters

    public Product(Long productId) {
        this.productId = productId;
    }

    public ArrayList<ProductImage> getImages() {
        return images;
    }

    public void setImages(ArrayList<ProductImage> images) {
        this.images = images;
    }

    public ArrayList<ProductPrice> getPrices() {
        return prices;
    }

    public void setPrices(ArrayList<ProductPrice> prices) {
        this.prices = prices;
    }

    public Product(Long productId, String name, String description, String unit, String manufacturerName, ProductStatus productStatus, ArrayList<ProductImage> images, ArrayList<ProductPrice> prices) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.productStatus = productStatus;
        this.images = images;
        this.prices = prices;
    }

    public Long getProductId() {
        return productId;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public ProductStatus getStatus() {
        return productStatus;
    }

    public void setStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product otherProduct = (Product) obj;
        return productId == otherProduct.productId;
    }
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", productStatus=" + productStatus +
                ", images=" + images +
                ", prices=" + prices +
                '}';
    }
}
