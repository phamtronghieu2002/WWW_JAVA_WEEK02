<%@ page import="fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.entities.Product" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.enums.ProductStatus" %>
<%@ page import="fit.iuh.edu.week02_lap_20062501_phamtronghieu_client.repositories.ProductRepositories" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home</title>
    <link rel="stylesheet" href="css/index.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<%
int cart_num = 0;
    if (session.getAttribute("carts") != null) {
        List<Product> cart = (List<Product>) session.getAttribute("carts");
        cart_num = cart.size();
    }


%>
 <div id="wrapper">
     <div class="container pt-3">

         <div class="row mb-3">
              <div class="col-md-12">
                  <% request.setAttribute("menuActive", "home"); %>
                  <%@ include file="./WEB-INF/layouts/header.jsp" %>

              </div>
         </div>
         <div class="d-flex justify-content-end position-relative">
            <a class="d-block" href="CartController?action=viewCart">
                <i class="fa-solid fa-cart-shopping"></i>
            </a>
             <div class="num_cart text-red"> <%=cart_num%> </div>
         </div>

         <div class="row" id="select">
             <div class="col-md-6">
                 <label class="form-label">Chọn khách hàng sử dụng</label>
                 <select class="form-select" aria-label="Default select example">

                     <option value="1">One</option>
                     <option value="2">Two</option>
                     <option value="3">Three</option>
                 </select>
             </div>
             <div class="col-md-6">
                 <label class="form-label">Chọn khách nhân viên</label>
                 <select class="form-select" aria-label="Default select example">

                     <option value="1">One</option>
                     <option value="2">Two</option>
                     <option value="3">Three</option>
                 </select>
             </div>

         </div>
         <h1 class="text-center mb-3 mt-3"> Danh mục sản phẩm</h1>
         <div class="row" id="product">
               <%

                   ArrayList<Product> productList   =   ProductRepositories.getProducts();
                   System.out.println("product nè ae ơi"+productList);
                   for (Product product : productList) {
                       if (product.getStatus().equals(ProductStatus.ACTIVE)) {
               %>
                    <div class="col-md-3">
                        <div class="card" >
                            <img src="<%=product.getImages().get(0).getPath()%>" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title"> <%=product.getName()%></h5>
                                <p class="card-text"><%=product.getDescription()%></p>
                                <p class="card-text"> giá <span class="fw-bold"><%=product.getPrices().get(0).getPrice()%></span></p>
                                <a href="CartController?action=addToCart&id=<%=product.getProductId()%>" class="btn btn-primary">Thêm vào giỏ hàng</a>
                            </div>
                        </div>
                    </div>
                 <%
                     }}
                 %>
         </div>

     </div>
 </div>





</body>
  <script src="js/index.js"> </script>
</html>