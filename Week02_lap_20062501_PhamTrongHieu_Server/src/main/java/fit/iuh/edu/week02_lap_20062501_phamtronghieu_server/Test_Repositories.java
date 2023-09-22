package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.models.Customer;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.services.CustomerService;

public class Test_Repositories {
    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        Customer  cus = new Customer("abc","xyz","jkl","opj");
        customerService.createCustomer(cus);







    }
}
