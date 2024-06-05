/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.nvql;

import dao.TKKhachHang715Dao;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.TKKhachHang715;
import model.ThongKe715;

/**
 *
 * @author Admin
 */
@WebServlet(name = "TKDanhSachKHController", urlPatterns = {"/tk-ds-kh"})
public class DanhSachTKKHController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String s = request.getParameter("start");
        String e = request.getParameter("end");
        LocalDate ngayBatDau = null, ngayKetThuc = null;
        DateTimeFormatter f = DateTimeFormatter.ofPattern( "yyyy-MM-dd" ) ;
        ngayBatDau = LocalDate.parse( s , f ) ;
        ngayKetThuc = LocalDate.parse( e , f ) ;
        ThongKe715 tk = new ThongKe715(Date.valueOf(ngayBatDau), Date.valueOf(ngayKetThuc));
        TKKhachHang715Dao tkkhDao = new TKKhachHang715Dao();
        ArrayList<TKKhachHang715> dsTKKH = tkkhDao.getDanhSachTKKH(tk);
        int tongDoanhThu = 0;
        for(int i = 0; i < dsTKKH.size(); i++) {
            tongDoanhThu += dsTKKH.get(i).getTongTienMua();
        }
        HttpSession session = request.getSession();
        session.setAttribute("thongke", tk);
        session.setMaxInactiveInterval(24 * 60 * 60 * 60);
        request.setAttribute("tongdoanhthu", tongDoanhThu);
        request.setAttribute("dsTKKH", dsTKKH);
        request.getRequestDispatcher("view/nvql/GDDanhSachTKKH.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
