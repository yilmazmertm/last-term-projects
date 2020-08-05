<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <section class="confirmation_part">
        <div class="container">
            <div class="row" style="padding-bottom: 50px;" >
                <div class="col-lg-12" align="center">
                    <input type="button" value="Add Customer"
                           onclick="window.location.href='showFormForAdd'; return false;" class="genric-btn primary e-large"/>
                </div>
            </div>
            <div class="row">
                <c:forEach var="tempCustomer" items="${customers}">
                    <c:url var="updateLink" value="/showFormForUpdate">
                        <c:param name="customerId" value="${tempCustomer.id}" />
                    </c:url>

                    <!-- construct an "delete" link with customer id -->
                    <c:url var="deleteLink" value="/delete">
                        <c:param name="customerId" value="${tempCustomer.id}" />
                    </c:url>
                <div class="col-lg-6 col-lx-4">
                    <div class="single_confirmation_details">
                        <h4>Customer info</h4>
                        <ul>
                            <li>
                                <p>First Name</p><span>${tempCustomer.firstName}</span>
                            </li>
                            <li>
                                <p>Last Name</p><span>${tempCustomer.lastName}</span>
                            </li>
                            <li>
                                <p>E-mail</p><span>${tempCustomer.email}</span>
                            </li>
                            <li>
                                <p>Actions</p><span><a href="${updateLink}" style="color: forestgreen">Update</a>|<a href="${deleteLink}"
                               onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false" style="color: red">Delete</a></span>
                            </li>
                        </ul>
                    </div>
                </div>
                </c:forEach>
            </div>
        </div>
    </section>
    <!--================ confirmation part end =================-->
</main>
<!-- JS here -->

<script src="../../resources/assets/js/vendor/modernizr-3.5.0.min.js"></script>
<!-- Jquery, Popper, Bootstrap -->
<script src="../../resources/assets/js/vendor/jquery-1.12.4.min.js"></script>
<script src="../../resources/assets/js/popper.min.js"></script>
<script src="../../resources/assets/js/bootstrap.min.js"></script>
<!-- Jquery Mobile Menu -->
<script src="../../resources/assets/js/jquery.slicknav.min.js"></script>

<!-- Jquery Slick , Owl-Carousel Plugins -->
<script src="../../resources/assets/js/owl.carousel.min.js"></script>
<script src="../../resources/assets/js/slick.min.js"></script>

<!-- One Page, Animated-HeadLin -->
<script src="../../resources/assets/js/wow.min.js"></script>
<script src="../../resources/assets/js/animated.headline.js"></script>
<script src="../../resources/assets/js/jquery.magnific-popup.js"></script>

<!-- Scroll up, nice-select, sticky -->
<script src="../../resources/assets/js/jquery.scrollUp.min.js"></script>
<script src="../../resources/assets/js/jquery.nice-select.min.js"></script>
<script src="../../resources/assets/js/jquery.sticky.js"></script>

<!-- contact js -->
<script src="../../resources/assets/js/contact.js"></script>
<script src="../../resources/assets/js/jquery.form.js"></script>
<script src="../../resources/assets/js/jquery.validate.min.js"></script>
<script src="../../resources/assets/js/mail-script.js"></script>
<script src="../../resources/assets/js/jquery.ajaxchimp.min.js"></script>

<!-- Jquery Plugins, main Jquery -->
<script src="../../resources/assets/js/plugins.js"></script>
<script src="../../resources/assets/js/main.js"></script>

</body>
</html>