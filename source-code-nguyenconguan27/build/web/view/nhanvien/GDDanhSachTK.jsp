<%-- 
    Document   : GDDanhSachTK
    Created on : Oct 19, 2023, 3:53:14 PM
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
    </head>
    <body>
        <div style="width: 1000px; text-align: center; margin-top: 100px">
            <form action="/tk-kh" method="get"> 
                <div class="row cols-9">
                    <div class="col-3">
                        <input type="radio" id="html" name="fav_language" value="HTML">
                                <label for="html">Thống kê khách hàng</label><br>
                    </div>
                    <div class="col-3">
                        <input type="radio" id="html" name="fav_language" value="HTML">
                                <label for="html">Thống kê mặt hàng</label><br>
                    </div>
                    <div class="col-3">
                        <input type="radio" id="html" name="fav_language" value="HTML">
                                <label for="html">Thống kê nhà cung cấp</label><br>  
                    </div>
                </div>

            </form>
        </div>
    </body>
</html>
