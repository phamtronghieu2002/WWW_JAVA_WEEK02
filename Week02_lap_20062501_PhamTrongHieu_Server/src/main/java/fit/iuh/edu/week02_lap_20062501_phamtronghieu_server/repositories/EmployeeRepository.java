package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.repositories;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.enums.EmployeeStatus;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Employee;

public class EmployeeRepository  extends  CRUD_GENERIC<Employee>{


    public EmployeeRepository(Class<Employee> cus) {
        super(cus);
    }


    public boolean updateStatus(int id, EmployeeStatus status) {
        Employee employee = findById(id);

            if (employee != null) {
            employee.setStatus(status);
            update(employee);
            return true;
        }
        return false;
    }



}
