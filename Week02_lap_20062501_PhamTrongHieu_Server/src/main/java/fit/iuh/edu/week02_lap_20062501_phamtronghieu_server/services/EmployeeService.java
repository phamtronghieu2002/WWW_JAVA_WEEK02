package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.services;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Employee;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.repositories.EmployeeRepository;

import java.util.List;

public class EmployeeService {

    private final EmployeeRepository EmployeeDao;

    public EmployeeService() {
        EmployeeDao = new EmployeeRepository(Employee.class);
    }

    public void createEmployee(Employee Employee) {
        EmployeeDao.create(Employee);
    }

    public void updateEmployee(Employee Employee) {
        EmployeeDao.update(Employee);
    }

    public void deleteEmployee(int EmployeeId) {
        Employee Employee = EmployeeDao.findById(EmployeeId);
        if (Employee != null) {
            EmployeeDao.delete(Employee);
        }
    }

    public Employee getEmployeeById(int EmployeeId) {
        return EmployeeDao.findById(EmployeeId);
    }

    public List<Employee> getAllEmployees() {
        return EmployeeDao.findAll();
    }

}
