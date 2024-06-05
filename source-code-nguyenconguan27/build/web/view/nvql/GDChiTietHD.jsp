<%-- 
    Document   : GDTKChiTietKH
    Created on : Oct 19, 2023, 3:53:42 PM
    Author     : Admin
--%>
<%@page import="model.HoaDonXuat715"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <h3>CHI TIẾT HOÁ ĐƠN</h3>
            </div>
            <div style="margin-top: 50px">
                <h6>Mã hoá đơn: ${hd.id}</h6>
                <h6>Ngày đặt hàng: ${hd.ngayDatHang}</h6>
                <h6>Ngày xuất hàng: ${hd.ngayXuat}</h6>
                <h6>Trạng thái đơn hàng: ${hd.trangThai}</h6>
                <h6>Nhân viên bán hàng: ${hd.nvBanHang.hoTen} - Mã nhân viên: ${hd.nvBanHang.id}</h6>
                <%
                    HoaDonXuat715 hd = (HoaDonXuat715) request.getAttribute("hd");
                    if (hd.getNvGiaoHang() != null) {
                %>
                <h6>Nhân viên giao hàng: ${hd.nvGiaoHang.hoTen} - Mã nhân viên: ${hd.nvGiaoHang.id}</h6>
                <% }%>
            </div>
            <div style="text-align: center">

                <h5>Danh sách hàng mua</h5>
                <table style="margin-top: 50px" class="table">
                    <thead>
                        <tr>
                            <th>Mã mặt hàng</th>
                            <th scope="col">Mặt hàng</th>
                            <th scope="col">Số lượng</th>
                            <th scope="col">Giá xuất</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${hd.hangXuat}" var="hx">    
                            <tr>
                                <td><p class="card-text show_txt">${hx.matHang.id} </p></td>
                                <td><p class="card-text show_txt">${hx.matHang.ten}</p></td>
                                <td><p style="margin-right: 20px" class="card-text show_txt">${hx.soLuong}</p></td>
                                <td><p style="margin-right: 20px" class="card-text show_txt">${hx.giaXuat}</p></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table> 
                <div style="text-align: right">
                    Tổng tiền: ${hd.tongTien} VNĐ
                </div>  
            </div>
            <div style="margin: 50px; text-align: left">
                <a href="/tk-ct-kh?id=${idkh}">Quay lại</a>
            </div>
        </div>
    </body>
</html>
