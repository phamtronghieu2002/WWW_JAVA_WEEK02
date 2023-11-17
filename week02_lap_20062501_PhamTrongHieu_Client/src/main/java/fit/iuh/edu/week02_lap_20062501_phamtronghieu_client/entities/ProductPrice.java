package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities;

import jakarta.persistence.*;

import java.sql.Date;



public class ProductPrice {



    private Product product;

    private Date priceDateTime;




    private double price;


    private String note;

    // Constructors, getters, and setters
    public ProductPrice() {
    }

    public ProductPrice(Date priceDateTime, double price, String note) {
        this.priceDateTime = priceDateTime;
        this.price = price;
        this.note = note;
    }

    public ProductPrice(Product product, Date priceDateTime, double price, String note) {
        this.product = product;
        this.priceDateTime = priceDateTime;
        this.price = price;
        this.note = note;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getPriceDateTime() {
        return priceDateTime;
    }

    public void setPriceDateTime(Date priceDateTime) {
        this.priceDateTime = priceDateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "product=" + product +
                ", priceDateTime=" + priceDateTime +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}