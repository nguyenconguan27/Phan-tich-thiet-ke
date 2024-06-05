<%-- 
    Document   : GDDangNhap
    Created on : Oct 24, 2023, 1:47:53 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .button {
                margin-top: 30px;
                background-color: #6699ff;
                color: #fff;
                width: 100px;
                height: 40px;
                border: none;
                border-radius: 3px;
            }
            .input {
                margin-top: 20px;
                border-radius: 3px;
                height: 40px
            }

        </style>
    </head>
    <body>
        <div style="text-align: center">
            <h2>ĐĂNG NHẬP</h2>
            <form action="/dang-nhap" method="post">
                <div>
                    <input name="user" class="input" placeholder="tên đăng nhập" />
                </div>
                <div>
                    <input name="pass" type="password" class="input" placeholder="mật khẩu"/>
                </div>
                <button class="button">Đăng nhập</button>
            </form>
        </div>

    </body>
</html>
