package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.services;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Order;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.repositories.OrderRepository;

import java.util.List;

public class OrderService {

    private final OrderRepository OrderDao;

    public OrderService() {
        OrderDao = new OrderRepository(Order.class);
    }

    public void createOrder(Order Order) {
        OrderDao.create(Order);
    }

    public void updateOrder(Order Order) {
        OrderDao.update(Order);
    }

    public void deleteOrder(int OrderId) {
        Order Order = OrderDao.findById(OrderId);
        if (Order != null) {
            OrderDao.delete(Order);
        }
    }

    public Order getOrderById(int OrderId) {
        return OrderDao.findById(OrderId);
    }

    public List<Order> getAllOrders() {
        return OrderDao.findAll();
    }

}
