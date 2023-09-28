<%@ page import="fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities.Employee" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.enums.EmployeeStatus" %>
<%@ page import="fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities.Product" %>
<%@ page import="fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.enums.ProductStatus" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>ManagerEmployee</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.7.1.js"
            integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
          integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
</head>
<body>
<div class="wrapper">
    <div class="container pt-3">
        <div class="row">
            <div class="col-md-12">
                <% request.setAttribute("menuActive", "managerProduct"); %>
                <%@ include file="../layouts/header.jsp" %>
            </div>
        </div>

        <div class="row mt-3 mb-3">
             <div class="col-md-12">
                <h2 class="text-center">Quản lý sản phẩm</h2>

             </div>

        </div>

        <form class="mt-3 mb-3" action="ProductController?actions=add" method="post">
            <div class="row">
                <div class="col-md-3">
                    <div class="mb-3">
                        <label class="form-label">description</label>
                        <input name="description" class="form-control"
                        >

                    </div>
                </div>
                <div class="col-md-3">
                    <div class="mb-3">
                        <label class="form-label">manufacturerName</label>
                        <input name="manufacturerName" type="text" class="form-control"
                        >

                    </div>
                </div>
                <div class="col-md-3">
                    <div class="mb-3">
                        <label class="form-label">name</label>
                        <input  name="name" type="text" class="form-control"
                        >

                    </div>
                </div>

                <div class="col-md-3">
                    <div class="mb-3">
                        <label class="form-label">unit</label>
                        <input id="email" name="unit" type="email" class="form-control"
                        >

                    </div>

                </div>

            </div>

            <div style="display: flex;justify-content: end">
                <button class="btn btn-primary">Thêm Sản phẩm</button>
            </div>

        </form>
        <div class="row">
            <table class="table table-striped">
                <thead>
                <tr>

                    <th>productId</th>
                    <th>name</th>
                    <th>description</th>
                    <th>unit</th>
                    <th>manufacturerName</th>
                    <th>productStatus</th>
                    <th>status</th>

                    <th>actions</th>
                </tr>
                </thead>
                <tbody>

                <%
                    ArrayList<Product> list = (ArrayList<Product>) request.getAttribute("products");

                    System.out.println(">>>check in view"+list);
                    //check null
                    if (list != null) {

                %>
                <%

                    for (Product product : list) {
                        if (product.getStatus().equals(ProductStatus.ACTIVE)) {


                %>
                <tr>
                    <td><%= product.getProductId() %></td>
                    <td><%= product.getName() %></td>
                    <td><%= product.getDescription() %></td>
                    <td><%= product.getUnit() %></td>
                    <td><%= product.getManufacturerName() %></td>
                    <td><%= product.getProductStatus() %></td>
                    <td><%= product.getStatus() %></td>
                    <td>
<%--                        <a href="EmployeeController?actions=edit&id=<%= product.getProductId() %>"--%>
<%--                           class="btn btn-warning"><i class="fas fa-edit"></i></a>--%>
                        <a href="ProductController?actions=delete&id=<%= product.getProductId() %>"
                           class="btn btn-danger"><i class="fas fa-trash"></i></a>
                    </td>
                </tr>
                <%
                    }

                %>

                <% } %>
                <%
                    }
                %>


                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>