package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Agenda;
import modelo.Contacto;
import modelo.ContactoDAO;

/**
 *
 * @author Desarrollo Web
 */
public class Controlador extends HttpServlet {

    String nombreDefecto = "esteban";
    String passDefecto = "esteban1";
    Agenda agenda1= new Agenda();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String accion= request.getParameter("accion");
        
        switch (accion) {
            case "iniciarSesion":
                String nombre = request.getParameter("nombreUsuario");
                String pass = request.getParameter("password");
                if (nombreDefecto.equals(nombre) && passDefecto.equals(pass)) {
                    response.sendRedirect("main.jsp");
                }
            break;
            
            case "agregar":
                request.getRequestDispatcher("agregarContacto.jsp").forward(request, response);

            break;
            
            case "agregarContacto":
                String nombreContacto= request.getParameter("nombreContacto");
                int telefonoContacto= Integer.parseInt(request.getParameter("telefonoContacto"));
                String emailContacto= request.getParameter("emailContacto");
                Contacto c= new Contacto(nombreContacto, telefonoContacto, emailContacto);
                ContactoDAO conDAO=new ContactoDAO();
                conDAO.add(c);
                request.setAttribute("mensaje", nombreContacto);
                request.getRequestDispatcher("agregarContacto.jsp?mensaje= "+nombreContacto).forward(request, response);
                
            break;
            
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
