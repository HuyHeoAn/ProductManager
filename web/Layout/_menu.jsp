<%-- 
    Document   : _menu
    Created on : Mar 5, 2024, 8:10:15 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="#"><span class="glyphicon glyphicon-home"></span> Trang chủ</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#"><span class="glyphicon glyphicon-th-list"></span> Giới thiệu</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#"><span class="glyphicon glyphicon-earphone"></span> Liên hệ</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#"><span class="glyphicon glyphicon-envelope"></span> Góp ý</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#"><span class="glyphicon glyphicon-question-sign"></span> Hỏi đáp</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown"
                   aria-haspopup="true" aria-expanded="false">
                    <span class="glyphicon glyphicon-user"></span>Tài khoản
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="#">Đăng Nhập</a>
                    <a class="dropdown-item" href="#">Quên mật khẩu</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Đăng xuất</a>
                    <a class="dropdown-item" href="#">Đổi mật khẩu</a>
                    <a class="dropdown-item" href="#">Cập nhật hồ sơ</a>
                </div>
            </li>
        </ul>
    </div>
    <ul class="navbar-nav reverser">
        <li class="nav-item">
            <a class="nav-link active" href="#">Tiếng anh</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Tiếng việt</a>
        </li>
    </ul>
</nav>
