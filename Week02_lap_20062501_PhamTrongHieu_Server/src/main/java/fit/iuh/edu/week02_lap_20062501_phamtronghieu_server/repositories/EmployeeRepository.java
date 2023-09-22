package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.repositories;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Employee;

public class EmployeeRepository  extends  CRUD_GENERIC<Employee>{


    public EmployeeRepository(Class<Employee> cus) {
        super(cus);
    }




}
