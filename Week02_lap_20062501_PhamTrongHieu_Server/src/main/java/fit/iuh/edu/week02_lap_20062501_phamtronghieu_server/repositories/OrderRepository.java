package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.repositories;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Order;

public class OrderRepository extends CRUD_GENERIC<Order>{
    public OrderRepository(Class<Order> entityClass) {
        super(entityClass);
    }
}
