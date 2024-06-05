<%-- 
    Document   : GDDanhSachMH
    Created on : Oct 19, 2023, 4:35:00 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page  pageEncoding="UTF-8" language="java" contentType="text/html; charset=UTF-8" import="java.util.*,dao.*,model.*"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="width: 1000px; margin-left: auto; margin-right: auto;">
            <h2 style="margin-left: auto; margin-right: auto; margin-bottom: 50px">Danh sách mặt hàng: ${name}</h2>
            <table class="table">
                <thead>
                    <tr>
                        <th>Mã mặt hàng</th>
                        <th scope="col">Mặt hàng</th>
                        <th scope="col">Giá</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${dsMH}" var="mh">
                    <tr>
                        <td>${mh.id}</td>
                        <td>
                            <a href="/chitiet?id=${mh.id}&name=${name}">
                            <p class="card-text show_txt">${mh.ten}</p>
                            <img style="height: 300px; width: 250px;" class="card-img-top" src="${mh.hinhAnh}" alt="Card image cap">
                            </a>
                        </td>
                        <td style="width: 200px"><p style="margin-top: 100px">${mh.giaNiemYet} VNĐ</p></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table> 
            <div style="margin-bottom: 50px">
                <a href="view/khachhang/GDTimKiemMH.jsp">Quay lại</a>
            </div>
        </div>
    </body>
</html>
