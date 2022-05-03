
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Persona;

@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {

      
    Controladora controle = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
         int id = Integer.parseInt(request.getParameter("id"));
         
        Persona pers = controle.Buscar(id);
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("persona", pers);
         
         response.sendRedirect("modificarPersona.jsp");
         
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
            
         int id = Integer.parseInt(request.getParameter("id"));
         String Dni = request.getParameter("dni");
         String Nombre = request.getParameter("nombre");
         String Apellido = request.getParameter("apellido");
         String Telefono = request.getParameter("telefono");
         
                
         Persona pers = controle.Buscar(id);
               
        pers.setDni(Dni);
        pers.setNombre(Nombre);
        pers.setApellido(Apellido);
        pers.setTelefono(Telefono);
        
        controle.Editar(pers);
        
        request.getSession().setAttribute("listaPersonas", controle.traerPersonas());
        response.sendRedirect("verPersonas.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
  
}
