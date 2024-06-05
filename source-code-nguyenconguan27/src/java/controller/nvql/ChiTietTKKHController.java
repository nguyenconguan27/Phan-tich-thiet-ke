package controller.nvql;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import dao.HoaDonXuat715Dao;
import dao.TKKhachHang715Dao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.HoaDonXuat715;
import model.TKKhachHang715;
import model.ThongKe715;

/**
 *
 * @author Admin
 */
@WebServlet(urlPatterns = {"/tk-ct-kh"})
public class ChiTietTKKHController extends HttpServlet {

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
        int idkh = Integer.parseInt(request.getParameter("id"));
        TKKhachHang715Dao tkkhDao = new TKKhachHang715Dao();
        HttpSession session = request.getSession();
        ThongKe715 tk = (ThongKe715) session.getAttribute("thongke");
        TKKhachHang715 tkkh = tkkhDao.getChiTietTKKH(tk, idkh);
        HoaDonXuat715Dao hdxDao = new HoaDonXuat715Dao();
        ArrayList<HoaDonXuat715> dsHD = hdxDao.getHDTheoIdKH(idkh, tk);
        request.setAttribute("dsHD", dsHD);
        request.setAttribute("kh", tkkh);
        request.getRequestDispatcher("view/nvql/GDChiTietTKKH.jsp").forward(request, response);
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
