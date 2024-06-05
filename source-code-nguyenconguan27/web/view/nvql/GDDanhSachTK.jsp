<%-- 
    Document   : GDDanhSachTK
    Created on : Oct 19, 2023, 3:53:14 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<% session.removeAttribute("thongke"); %>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="margin-left: auto; margin-right: auto; width: 1000px; text-align: center; margin-top: 100px">
            <h2>CHỌN LOẠI THỐNG KÊ</h2>
                <div class="row" style="margin-top: 100px">
                    <div class="col-4">
                        <a href="GDDanhSachTKKH.jsp">Thống kê khách hàng</a>
                    </div>
                    <div class="col-4">
                        <a href="#">Thống kê mặt hàng</a>
                    </div>
                    <div class="col-4">
                        <a href="#">Thống kê nhà cung cấp</a>
                    </div>
                </div>
            <div style="margin: 50px; text-align: left">
                <a href="/view/nvql/GDChinhNVQL.jsp">Quay lại</a>
            </div>
        </div>
    </body>
</html>
