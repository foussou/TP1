/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
@WebServlet(urlPatterns = {"/ExperimentServlet"})
public class ExperimentServlet extends HttpServlet {

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
        InetAddress IP = InetAddress.getLocalHost();
        String ndramanIP = IP.getHostAddress();
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ExperimentServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ma Premiere Servlet</h1>");
            out.print("<h2>Information concernant l'adresse IP et le navigateur utilisé par le client :</h2>");
            out.print("<p> Adresse IP du client : "+ndramanIP +"</p>");
            out.println("<p>user-agent : "+ request.getHeader("User-Agent") +"</p>");
            out.print("<p> Navigateur du client :"+request.getHeader("Accept")+" </p>");
            out.println("<p>Accept-language : "+ request.getHeader("Accept-language") +"</p>");
            out.println("<p>Accept-charset : "+ request.getHeader("Accept-charset") +"</p>");
            out.println("<p>kip-alive : "+ request.getHeader("kip-alive") +"</p>");
            out.println("<p>connection : "+ request.getHeader("Connection") +"</p>");
            out.print("<h2>Information concernant la requête du client :</h2>");
            out.print("<p> Methode : "+request.getMethod()+"</p>");
            out.print("<p> Protocole : "+request.getProtocol()+"</p>");
            out.print("<p> URI démandé : "+request.getRequestURI()+"</p>");
            
            out.print("<h1> Information concernant l'entête de la requête : </h1>");
            out.print("<P>Host:  "+request.getServerName()+" : "+request.getServerPort()+"</p>");
            out.print("<p> User-agent:"+request.getCharacterEncoding()+"</p>");
            out.print("<p> Accept: </p>");
            out.print("<p> Accept-language: "+request.getLocale()+"</p>");
            out.print("<p> Accept-encoding: </p>");
            out.print("<p> Accept-charset: </p>");
            out.print("<p> kip-alive: </p>");
            out.print("<p>connexion: </p>");
            out.println("</body>");
            out.println("</html>");
        }
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
