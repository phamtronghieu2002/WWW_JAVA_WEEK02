package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities;


import java.util.Date;

public class Order {


    private Long orderId;




    private Employee employee;


    private Customer customer;

    private Date orderDate;
    // Constructors, getters, and setters
    public Order() {
    }


    public Order(Long orderId, Employee employee, Customer customer, Date orderDate) {
        this.orderId = orderId;
        this.employee = employee;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", employee=" + employee +
                ", customer=" + customer +
                '}';
    }
}
