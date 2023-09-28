package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.repositories;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities.Employee;


import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.enums.EmployeeStatus;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class EmployeeRepositories {



    public static ArrayList<Employee> getEmployees() {
        HttpClient httpClient = HttpClientBuilder.create().build();
        String apiUrl = "http://localhost:8080/week02/api/employees";
        var httpGet = new HttpGet(apiUrl);
        ArrayList<Employee> EmployeeList = new ArrayList<>();

        try {
            HttpResponse response = httpClient.execute(httpGet);
            String responseBody = EntityUtils.toString(response.getEntity());

            JSONArray jsonArray = new JSONArray(responseBody);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);



                int empId = obj.getInt("empId");
                String fullName = obj.getString("fullName");
                String email = obj.getString("email");
                String phone = obj.getString("phone");
                String address = obj.getString("address");
                Date dob = new Date(obj.getLong("dob"));

                EmployeeStatus status =   EmployeeStatus.valueOf(obj.getString("status"));

                Employee employee = new Employee(empId, fullName, dob, email, phone, address, status);

                EmployeeList.add(employee);








            }
            System.out.println(EmployeeList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

        return EmployeeList;
    }

    public static void createEmployee(Employee employee) {
        HttpClient httpClient = HttpClientBuilder.create().build();
        String apiUrl = "http://localhost:8080/week02/api/employees";
        HttpPost httpPost = new HttpPost(apiUrl);

        try {
            // Convert Employee object to JSON
            JSONObject employeeJson = new JSONObject();
            employeeJson.put("empId", employee.getEmpId());
            employeeJson.put("fullName", employee.getFullName());
            employeeJson.put("email", employee.getEmail());
            employeeJson.put("phone", employee.getPhone());
            employeeJson.put("address", employee.getAddress());


            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
            LocalDate localDate = LocalDate.parse(employee.getDob().toString(), formatter);


            java.util.Date utilDate = java.sql.Date.valueOf(localDate);
            System.out.println(utilDate);


            employeeJson.put("dob", utilDate); // Convert Date to timestamp
            employeeJson.put("status", employee.getStatus().toString());

            // Set the JSON payload in the request
            StringEntity requestEntity = new StringEntity(employeeJson.toString());
            httpPost.setEntity(requestEntity);
            httpPost.setHeader("Content-type", "application/json");

            // Execute the POST request
            HttpResponse response = httpClient.execute(httpPost);
            String responseBody = EntityUtils.toString(response.getEntity());

            // Process the response if needed
            System.out.println(responseBody);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }


    public static void deleteEmployee(int empId) {
        HttpClient httpClient = HttpClientBuilder.create().build();
        String apiUrl = "http://localhost:8080/week02/api/employees/" + empId;  // Assuming the API endpoint supports DELETE by employee ID
        HttpDelete httpDelete = new HttpDelete(apiUrl);

        try {
            HttpResponse response = httpClient.execute(httpDelete);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode == 204) {
                System.out.println("Employee deleted successfully");
            } else {
                System.out.println("Failed to delete employee. Status code: " + statusCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close resources if needed
        }
    }

}
