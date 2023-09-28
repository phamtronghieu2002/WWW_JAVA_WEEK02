package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.repositories;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities.Customer;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;


import java.util.ArrayList;

public class CustomerRepositories {



        public static void getCustomer() {
            HttpClient httpClient = HttpClientBuilder.create().build();
            String apiUrl = "http://localhost:8080/week02/api/customers";
            var httpGet = new HttpGet(apiUrl);
            ArrayList<Customer> customerList = new ArrayList<>();

            try {
                HttpResponse response = httpClient.execute(httpGet);
                String responseBody = EntityUtils.toString(response.getEntity());

                JSONArray jsonArray = new JSONArray(responseBody);

                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject obj = jsonArray.getJSONObject(i);


                    Long cust_id = obj.getLong("cust_id");
                    String cust_name = obj.getString("cust_name");
                    String email = obj.getString("email");
                    String phone = obj.getString("phone");
                    String address = obj.getString("address");

                    Customer customer = new Customer(cust_id, cust_name, email, phone, address);
                    customerList.add(customer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {

            }


        }


}
