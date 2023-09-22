package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models;
import jakarta.persistence.*;



@Entity
@Table(name = "order_details")
public class OrderDetail {


    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @Column(name = "note")
    private String note;

    // Constructors, getters, and setters
    public OrderDetail() {
    }

    public OrderDetail( Order order, Product product, int quantity, double price, String note) {

        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.note = note;
    }


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        return "OrderDetail{" +

                ", order=" + order +
                ", product=" + product +
                ", quantity=" + quantity +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
