package fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.repositories;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.enums.ProductStatus;
import fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.models.Product;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class ProductRepositories {
    public static ArrayList<Product> getProduct() {
        HttpClient httpClient = HttpClientBuilder.create().build();
        String apiUrl = "URL_API_CUA_BAN";
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
                Long product_id = obj.getLong("product_id");
                String name = obj.getString("name");
                String description = obj.getString("description");
                String unit = obj.getString("unit");
                String manufacturer_name = obj.getString("manufacturer_name");
                ProductStatus status = ProductStatus.valueOf(obj.getString("status"));

                Product product = new Product(product_id, name, description, unit, manufacturer_name, status);
                productList.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

        return productList;
    }


}
