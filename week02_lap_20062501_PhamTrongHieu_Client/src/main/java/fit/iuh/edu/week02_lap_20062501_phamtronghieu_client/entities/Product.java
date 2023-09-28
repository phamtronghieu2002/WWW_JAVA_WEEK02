package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.enums.ProductStatus;


public class Product {


    private Long productId;


    private String name;


    private String description;


    private String unit;


    private String manufacturerName;


    private ProductStatus productStatus;

    // Constructors, getters, and setters

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
    public String toString() {
        return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", unit=" + unit
                + ", manufacturerName=" + manufacturerName + ", status=" + productStatus + "]";
    }
}
