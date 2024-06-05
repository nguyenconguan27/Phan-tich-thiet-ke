<%-- 
    Document   : GDTimKiemMH
    Created on : Oct 19, 2023, 4:34:44 PM
    Author     : Admin
--%>

<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=UTF-8" import="java.util.*,dao.*,model.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
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
                border-radius: 3px;
                height: 40px
            }
            
        </style>
    </head>
    <body>
        <div style="width: 100%; text-align: center; margin-top: 100px">
            <h2>TÌM KIẾM MẶT HÀNG</h2>
            <form action="/search" method="get" class="form-inline my-2 my-lg-0">
                <div class="input-group input-group-sm">
                    <input name="name" type="text" method="GET" class="input" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
                    <div class="input-group-append">
                        <button type="submit" class="button">
                            Tìm kiếm
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
