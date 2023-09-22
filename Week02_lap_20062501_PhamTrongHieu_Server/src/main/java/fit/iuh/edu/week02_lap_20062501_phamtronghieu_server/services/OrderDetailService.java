package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.services;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.OrderDetail;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.repositories.OrderDetailRepository;

import java.util.List;

public class OrderDetailService {

    private final OrderDetailRepository OrderDetailDao;

    public OrderDetailService() {
        OrderDetailDao = new OrderDetailRepository(OrderDetail.class);
    }

    public void createOrderDetail(OrderDetail OrderDetail) {
        OrderDetailDao.create(OrderDetail);
    }

    public void updateOrderDetail(OrderDetail OrderDetail) {
        OrderDetailDao.update(OrderDetail);
    }

    public void deleteOrderDetail(int OrderDetailId) {
        OrderDetail OrderDetail = OrderDetailDao.findById(OrderDetailId);
        if (OrderDetail != null) {
            OrderDetailDao.delete(OrderDetail);
        }
    }

    public OrderDetail getOrderDetailById(int OrderDetailId) {
        return OrderDetailDao.findById(OrderDetailId);
    }

    public List<OrderDetail> getAllOrderDetails() {
        return OrderDetailDao.findAll();
    }

}
