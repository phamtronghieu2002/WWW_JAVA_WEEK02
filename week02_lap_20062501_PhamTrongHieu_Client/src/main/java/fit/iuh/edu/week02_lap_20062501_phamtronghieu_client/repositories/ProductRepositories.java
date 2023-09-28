package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.repositories;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities.Employee;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.enums.ProductStatus;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities.Product;
import org.apache.http.HttpResponse;
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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class ProductRepositories {
    public static ArrayList<Product> getProducts() {
        HttpClient httpClient = HttpClientBuilder.create().build();
        String apiUrl = "http://localhost:8080/week02/api/products";
        var httpGet = new HttpGet(apiUrl);
        ArrayList<Product> productList = new ArrayList<>();

        try {
            HttpResponse response = httpClient.execute(httpGet);
            String responseBody = EntityUtils.toString(response.getEntity());

            // Chuyển đổi JSON thành mảng đối tượng (array of objects)
            JSONArray jsonArray = new JSONArray(responseBody);

            // Xử lý mảng đối tượng ở đây và thêm chúng vào danh sách sản phẩm
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);

                // Lấy thông tin từ JSON và tạo đối tượng Product
                Long product_id = obj.getLong("productId");
                

                String name = obj.getString("name");
                String description = obj.getString("description");
                String unit = obj.getString("unit");
                String manufacturer_name = obj.getString("manufacturerName");
                ProductStatus status = ProductStatus.valueOf(obj.getString("status"));

                Product product = new Product(product_id, name, description, unit, manufacturer_name, status);
                productList.add(product);
            }
            System.out.println( productList );
        }

        catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

        return productList;
    }


    public static void createProduct(Product product) {
        HttpClient httpClient = HttpClientBuilder.create().build();
        String apiUrl = "http://localhost:8080/week02/api/products";
        HttpPost httpPost = new HttpPost(apiUrl);

        try {
            // Convert Employee object to JSON
            JSONObject productJson = new JSONObject();

            productJson.put("name", product.getName());
            productJson.put("description", product.getDescription());
            productJson.put("unit", product.getUnit());
            productJson.put("manufacturerName", product.getManufacturerName());
            productJson.put("productStatus", product.getStatus().toString());








            // Set the JSON payload in the request
            StringEntity requestEntity = new StringEntity(productJson.toString());
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


    public static void deleteProduct(long ProductId) {
        HttpClient httpClient = HttpClientBuilder.create().build();
        String apiUrl = "http://localhost:8080/week02/api/products/" + ProductId;  // Assuming the API endpoint supports DELETE by employee ID
        HttpDelete httpDelete = new HttpDelete(apiUrl);

        try {
            HttpResponse response = httpClient.execute(httpDelete);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode == 204) {
                System.out.println("Product deleted successfully");
            } else {
                System.out.println("Failed to delete product. Status code: " + statusCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close resources if needed
        }
    }
}
