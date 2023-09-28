<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link <%= (request.getAttribute("menuActive") != null && request.getAttribute("menuActive").equals("home")) ? "active" : "" %>" aria-current="page" href="index.jsp">Home</a>
                </li>
                </li>
                <li class="nav-item">
                    <a class="nav-link <%= (request.getAttribute("menuActive") != null && request.getAttribute("menuActive").equals("managerEmployee")) ? "active" : ""%>" href="EmployeeController">Quản lí nhân viên</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link <%= (request.getAttribute("menuActive") != null && request.getAttribute("menuActive").equals("managerProduct")) ? "active" : ""%>" href="ProductController">Quản lí sản phẩm</a>
                </li>
            </ul>

        </div>
    </div>
</nav>