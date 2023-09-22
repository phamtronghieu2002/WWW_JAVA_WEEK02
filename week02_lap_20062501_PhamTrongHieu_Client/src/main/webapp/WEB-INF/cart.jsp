
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Cart</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="../css/cart.css">
</head>
</head>
<body>
   <div class="wrapper">
        <div class="container">
            <h1 class="text-center"> giỏ hàng</h1>
            <section class="h-100" style="background-color: #eee;">
                <div class="container h-100 py-5">
                    <div class="row d-flex justify-content-center align-items-center h-100">
                        <div class="col-10">

                            <div class="d-flex justify-content-between align-items-center mb-4">
                                <h3 class="fw-normal mb-0 text-black">Shopping Cart</h3>
                                <div>
                                    <p class="mb-0"><span class="text-muted">Sort by:</span> <a href="#!" class="text-body">price <i
                                            class="fas fa-angle-down mt-1"></i></a></p>
                                </div>
                            </div>

                            <div class="card rounded-3 mb-4">
                                <div class="card-body p-4">
                                    <div class="row d-flex justify-content-between align-items-center">
                                        <div class="col-md-2 col-lg-2 col-xl-2">
                                            <img
                                                    src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-shopping-carts/img1.webp"
                                                    class="img-fluid rounded-3" alt="Cotton T-shirt">
                                        </div>
                                        <div class="col-md-3 col-lg-3 col-xl-3">
                                            <p class="lead fw-normal mb-2">Basic T-shirt</p>
                                            <p><span class="text-muted">Size: </span>M <span class="text-muted">Color: </span>Grey</p>
                                        </div>
                                        <div class="col-md-3 col-lg-3 col-xl-2 d-flex">
                                            <button class="btn btn-link px-2"
                                                    onclick="this.parentNode.querySelector('input[type=number]').stepDown()">
                                                <i class="fas fa-minus"></i>
                                            </button>

                                            <input id="form3" min="0" name="quantity" value="2" type="number"
                                                   class="form-control form-control-sm" />

                                            <button class="btn btn-link px-2"
                                                    onclick="this.parentNode.querySelector('input[type=number]').stepUp()">
                                                <i class="fas fa-plus"></i>
                                            </button>
                                        </div>
                                        <div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1">
                                            <h5 class="mb-0">$499.00</h5>
                                        </div>
                                        <div class="col-md-1 col-lg-1 col-xl-1 text-end">
                                            <a href="#!" class="text-danger"><i class="fas fa-trash fa-lg"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="card rounded-3 mb-4">
                                <div class="card-body p-4">
                                    <div class="row d-flex justify-content-between align-items-center">
                                        <div class="col-md-2 col-lg-2 col-xl-2">
                                            <img
                                                    src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-shopping-carts/img1.webp"
                                                    class="img-fluid rounded-3" alt="Cotton T-shirt">
                                        </div>
                                        <div class="col-md-3 col-lg-3 col-xl-3">
                                            <p class="lead fw-normal mb-2">Basic T-shirt</p>
                                            <p><span class="text-muted">Size: </span>M <span class="text-muted">Color: </span>Grey</p>
                                        </div>
                                        <div class="col-md-3 col-lg-3 col-xl-2 d-flex">
                                            <button class="btn btn-link px-2"
                                                    onclick="this.parentNode.querySelector('input[type=number]').stepDown()">
                                                <i class="fas fa-minus"></i>
                                            </button>

                                            <input id="form6" min="0" name="quantity" value="2" type="number"
                                                   class="form-control form-control-sm" />

                                            <button class="btn btn-link px-2"
                                                    onclick="this.parentNode.querySelector('input[type=number]').stepUp()">
                                                <i class="fas fa-plus"></i>
                                            </button>
                                        </div>
                                        <div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1">
                                            <h5 class="mb-0">$499.00</h5>
                                        </div>
                                        <div class="col-md-1 col-lg-1 col-xl-1 text-end">
                                            <a href="#!" class="text-danger"><i class="fas fa-trash fa-lg"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="card rounded-3 mb-4">
                                <div class="card-body p-4">
                                    <div class="row d-flex justify-content-between align-items-center">
                                        <div class="col-md-2 col-lg-2 col-xl-2">
                                            <img
                                                    src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-shopping-carts/img1.webp"
                                                    class="img-fluid rounded-3" alt="Cotton T-shirt">
                                        </div>
                                        <div class="col-md-3 col-lg-3 col-xl-3">
                                            <p class="lead fw-normal mb-2">Basic T-shirt</p>
                                            <p><span class="text-muted">Size: </span>M <span class="text-muted">Color: </span>Grey</p>
                                        </div>
                                        <div class="col-md-3 col-lg-3 col-xl-2 d-flex">
                                            <button class="btn btn-link px-2"
                                                    onclick="this.parentNode.querySelector('input[type=number]').stepDown()">
                                                <i class="fas fa-minus"></i>
                                            </button>

                                            <input id="form2" min="0" name="quantity" value="2" type="number"
                                                   class="form-control form-control-sm" />

                                            <button class="btn btn-link px-2"
                                                    onclick="this.parentNode.querySelector('input[type=number]').stepUp()">
                                                <i class="fas fa-plus"></i>
                                            </button>
                                        </div>
                                        <div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1">
                                            <h5 class="mb-0">$499.00</h5>
                                        </div>
                                        <div class="col-md-1 col-lg-1 col-xl-1 text-end">
                                            <a href="#!" class="text-danger"><i class="fas fa-trash fa-lg"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="card rounded-3 mb-4">
                                <div class="card-body p-4">
                                    <div class="row d-flex justify-content-between align-items-center">
                                        <div class="col-md-2 col-lg-2 col-xl-2">
                                            <img
                                                    src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-shopping-carts/img1.webp"
                                                    class="img-fluid rounded-3" alt="Cotton T-shirt">
                                        </div>
                                        <div class="col-md-3 col-lg-3 col-xl-3">
                                            <p class="lead fw-normal mb-2">Basic T-shirt</p>
                                            <p><span class="text-muted">Size: </span>M <span class="text-muted">Color: </span>Grey</p>
                                        </div>
                                        <div class="col-md-3 col-lg-3 col-xl-2 d-flex">
                                            <button class="btn btn-link px-2"
                                                    onclick="this.parentNode.querySelector('input[type=number]').stepDown()">
                                                <i class="fas fa-minus"></i>
                                            </button>

                                            <input id="form4" min="0" name="quantity" value="2" type="number"
                                                   class="form-control form-control-sm" />

                                            <button class="btn btn-link px-2"
                                                    onclick="this.parentNode.querySelector('input[type=number]').stepUp()">
                                                <i class="fas fa-plus"></i>
                                            </button>
                                        </div>
                                        <div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1">
                                            <h5 class="mb-0">$499.00</h5>
                                        </div>
                                        <div class="col-md-1 col-lg-1 col-xl-1 text-end">
                                            <a href="#!" class="text-danger"><i class="fas fa-trash fa-lg"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>


                            <div class="card">
                                <div class="card-body">
                                    <button type="button" class="btn btn-warning btn-block btn-lg">Thanh Toán</button>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </section>



        </div>
   </div>
</body>
 <script src="../js/cart.js"></script>
</html>