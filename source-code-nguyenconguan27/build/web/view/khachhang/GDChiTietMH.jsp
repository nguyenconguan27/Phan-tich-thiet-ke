<%-- 
    Document   : GDChiTieMH
    Created on : Oct 19, 2023, 4:35:10 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .container {
                width: 1000px;
                height: 700px;
                text-align: center;
                border: solid 10px;
                border-radius: 10px;
                margin-top: 50px;
                margin-left: auto;
                margin-right: auto;
            }
        </style>
    </head>
 
    <body>
        <div class="container">
            <h2>CHI TIẾT SẢN PHẨM</h2>
            <div class="row" style="padding-top: 50px">
                <div class="col-6" style="text-align: center">
                    <div>
                        <img src="${mh.hinhAnh}" style="width: 90%">
                    </div>
                    <p style="margin-top: 10px">${mh.ten}</p>
                </div>
                <div class="col-6" style="text-align: left">
                    <p style="margin-top: 80px">${mh.moTa}</p>
                    <p styel="margin-top: 500px">Giá: ${mh.giaNiemYet}VNĐ</p>
                    <div>
                        <button type="submit" class="button">
                            Thêm vào giỏ hàng
                        </button>
                    </div>
                    
                </div>
            </div>
            <div style="margin-bottom: 50px; text-align: left">
                <a href="/search?name=${name}">Quay lại</a>
            </div>
        </div>
    </body>
</html>
