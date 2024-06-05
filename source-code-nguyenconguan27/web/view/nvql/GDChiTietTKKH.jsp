<%-- 
    Document   : GDTKChiTietKH
    Created on : Oct 19, 2023, 3:53:42 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.ThongKe715"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" session="true"%>
<%@ page import = "java.sql.Date" %>
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
        <div style="width: 1000px; margin-left: auto; margin-right: auto; margin-top: 50px">
            <div style="text-align: center">
                <h3>CHI TIẾT THỐNG KÊ KHÁCH HÀNG</h3>
                <h6>Ngày bắt đầu: <%=tk.getNgayBatDau()%></h6>
                <h6>Ngày kết thúc: <%=tk.getNgayKetThuc()%></h6>
            </div>
            <div style="margin-top: 50px">
                <h6>Mã khách hàng: ${kh.id}</h6>
                <h6>Họ tên: ${kh.hoTen}</h6>
                <h6>Số điện thoại: ${kh.sdt}</h6>
                <h6>Địa chỉ: ${kh.diaChi}</h6>
            </div>
            <div style="text-align: center">

                <h5>Danh sách hoá đơn</h5>
                <table style="margin-top: 50px" class="table">
                    <thead>
                        <tr>
                            <th scope="col">Mã hoá đơn</th>
                            <th scope="col">Ngày đặt hàng</th>
                            <th scope="col">Ngày xuất hàng</th>
                            <th scope="col">Trạng thái</th>
                            <th scope="col">Ghi chú</th>
                            <th scope="col">Tổng tiền</th>
                            <th scope="col">Chi tiết</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${dsHD}" var="hd">    
                            <tr>
                                <td><p class="card-text show_txt">${hd.id}</p></td>
                                <td><p style="margin-right: 20px" class="card-text show_txt">${hd.ngayDatHang}</p></td>
                                <td><p style="margin-right: 20px" class="card-text show_txt">${hd.ngayXuat}</p></td>
                                <td><p>${hd.trangThai}</p></td>
                                <td><p>${hd.ghiChu}</p></td>
                                <td><p>${hd.tongTien} VNĐ</p></td>
                                <td><a href="/ct-hd?id=${hd.id}&idkh=${kh.id}">chi tiết</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table> 
                <div style="text-align: right">
                    Tổng doanh thu: ${kh.tongTienMua} VNĐ
                </div>
            </div>
            <div style="margin: 50px; text-align: left">
                <a href="/tk-ds-kh?start=<%=tk.getNgayBatDau()%>&end=<%=tk.getNgayKetThuc()%>">Quay lại</a>
            </div>
        </div>
    </body>
</html>
