<%-- 
    Document   : GDDanhSachMH
    Created on : Oct 19, 2023, 4:35:00 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page  pageEncoding="UTF-8" language="java" contentType="text/html; charset=UTF-8" import="java.util.*,dao.*,model.*"%>
<% ThongKe715 tk = (ThongKe715) session.getAttribute("thongke");%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="width: 1000px; margin-left: auto; margin-right: auto; margin-top: 100px">
            <div class="row">
                <div clas="col-6">
                    <h2>DANH SÁCH THỐNG KÊ KHÁCH HÀNG</h2>
                    <h3 style="margin-left: auto; margin-right: auto;">TỔNG DOANH THU: ${tongdoanhthu}</h3>
                </div>
                <form style="margin-top: 50px" action="/tk-ds-kh" method="get"> 
                    <div class="row" style="margin-top: 100px">
                        <div class="col-4">
                            <label for="html">Ngày bắt đầu: </label>
                            <input value="<%=tk != null ? tk.getNgayBatDau() : "2000-01-01"%>" type="date" name="start">
                                
                        </div>
                        <div class="col-4">
                            <label for="html">Ngày kết thúc: </label>
                            <input value="<%=tk != null ? tk.getNgayKetThuc() : ""%>" type="date" name="end" id="theDate">
                        </div>
                        <div class="col-4">
                            <button>Xem thống kê</button>
                        </div>
                    </div>
                </form>
            </div>

            <table style="margin-top: 50px" class="table">
                <thead>
                    <tr>
                        <th scope="col">Mã khách hàng</th>
                        <th scope="col">Tên khách hàng</th>
                        <th scope="col">Số lần mua</th>
                        <th scope="col">Tổng tiền mua</th>
                        <th scope="col">Chi tiết</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${dsTKKH}" var="tkkh">
                        <tr>
                            <td>
                                <p class="card-text show_txt">${tkkh.id}</p>
                            </td>
                            <td><p style="margin-right: 20px" class="card-text show_txt">${tkkh.hoTen}</p></td>
                            <td><p style="margin-right: 20px" class="card-text show_txt">${tkkh.soLanMua}</p></td>
                            <td style="width: 200px"><p>${tkkh.tongTienMua} VNĐ</p></td>
                            <td style="width: 200px"><a href="/tk-ct-kh?id=${tkkh.id}">Chi tiết</a> 
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table> 
            <div style="margin: 50px; text-align: left">
                <a href="/view/nvql/GDDanhSachTK.jsp">Quay lại</a>
            </div>
        </div>
    </body>
    <script>
        var date = new Date();
        var day = date.getDate();
        var month = date.getMonth() + 1;
        var year = date.getFullYear();

        if (month < 10)
            month = "0" + month;
        if (day < 10)
            day = "0" + day;

        var today = year + "-" + month + "-" + day;
        if (document.getElementById("theDate").value === "") {
            document.getElementById("theDate").value = today;
        }

    </script>
</html>
