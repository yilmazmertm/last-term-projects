<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="zxx">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Customer Relationship Manager</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/x-icon" href="../../resources/assets/img/favicon.ico">

    <!-- CSS here -->
    <link rel="stylesheet" href="../../resources/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../resources/assets/css/owl.carousel.min.css">
    <link rel="stylesheet" href="../../resources/assets/css/flaticon.css">
    <link rel="stylesheet" href="../../resources/assets/css/slicknav.css">
    <link rel="stylesheet" href="../../resources/assets/css/animate.min.css">
    <link rel="stylesheet" href="../../resources/assets/css/magnific-popup.css">
    <link rel="stylesheet" href="../../resources/assets/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="../../resources/assets/css/themify-icons.css">
    <link rel="stylesheet" href="../../resources/assets/css/slick.css">
    <link rel="stylesheet" href="../../resources/assets/css/nice-select.css">
    <link rel="stylesheet" href="../../resources/assets/css/style.css">
</head>
<body>
<header>
    <!-- Header Start -->
    <div class="header-area">
        <div class="main-header header-sticky">
            <div class="container-fluid">
                <div class="menu-wrapper">
                    <!-- Logo -->
                    <div class="logo">
                        <a href="${pageContext.request.contextPath}/"><img src="../../resources/assets/img/logo/logo.png" alt=""></a>
                    </div>
                    <!-- Main-menu -->
                    <div class="main-menu d-none d-lg-block">
                        <nav>
                            <ul id="navigation">
                                <li><a href="${pageContext.request.contextPath}/">Customer List</a></li>
                                <li><a href="${pageContext.request.contextPath}/showFormForAdd">Add Customer</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <!-- Mobile Menu -->
                <div class="col-12">
                    <div class="mobile_menu d-block d-lg-none"></div>
                </div>
            </div>
        </div>
    </div>
    <!-- Header End -->
</header>
<main>
    <!-- Hero Area Start-->
    <div class="slider-area">
        <div class="single-slider slider-height2 d-flex align-items-center">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="hero-cap text-center">
                            <h2>Add Customer</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Hero Area End-->
    <!--================login_part Area =================-->
    <section class="login_part ">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-12 col-md-12">
                    <div class="login_part_form">
                        <div class="login_part_form_iner">
                            <h3>Welcome Back ! <br>
                                Please Add Customer now</h3>
                            <form:form class="row contact_form" action="saveCustomer" method="post" modelAttribute="customer">
                                <form:hidden path="id" />
                                <div class="col-md-12 form-group p_star">
                                    <form:input type="text" class="form-control" path="firstName" value=""
                                           placeholder="First Name" />
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <form:input type="text" class="form-control" path="lastName" value=""
                                           placeholder="Last Name" />
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <form:input type="text" class="form-control" path="email" value=""
                                           placeholder="Email" />
                                </div>
                                <div class="col-md-12 form-group">
                                    <button type="submit" value="submit" class="btn_3">Save</button>
                                </div>
                            </form:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
<!-- JS here -->

<script src="./assets/js/vendor/modernizr-3.5.0.min.js"></script>
<!-- Jquery, Popper, Bootstrap -->
<script src="./assets/js/vendor/jquery-1.12.4.min.js"></script>
<script src="./assets/js/popper.min.js"></script>
<script src="./assets/js/bootstrap.min.js"></script>
<!-- Jquery Mobile Menu -->
<script src="./assets/js/jquery.slicknav.min.js"></script>

<!-- Jquery Slick , Owl-Carousel Plugins -->
<script src="./assets/js/owl.carousel.min.js"></script>
<script src="./assets/js/slick.min.js"></script>

<!-- One Page, Animated-HeadLin -->
<script src="./assets/js/wow.min.js"></script>
<script src="./assets/js/animated.headline.js"></script>

<!-- Scroll up, nice-select, sticky -->
<script src="./assets/js/jquery.scrollUp.min.js"></script>
<script src="./assets/js/jquery.nice-select.min.js"></script>
<script src="./assets/js/jquery.sticky.js"></script>
<script src="./assets/js/jquery.magnific-popup.js"></script>

<!-- contact js -->
<script src="./assets/js/contact.js"></script>
<script src="./assets/js/jquery.form.js"></script>
<script src="./assets/js/jquery.validate.min.js"></script>
<script src="./assets/js/mail-script.js"></script>
<script src="./assets/js/jquery.ajaxchimp.min.js"></script>

<!-- Jquery Plugins, main Jquery -->
<script src="./assets/js/plugins.js"></script>
<script src="./assets/js/main.js"></script>

</body>

</html>
