/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Persona;

/**
 *
 * @author marva
 */
@WebServlet(name = "SvPersona", urlPatterns = {"/SvPersona"})
public class SvPersona extends HttpServlet {
    
//instancia a mi controladora de la lógica
    
    Controladora control = new Controladora();

        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        //traer las personas de la bd
        List <Persona>listaPersonas = control.traerPersonas();
        
        //guardar los datos de la sesion del usuiario
        HttpSession miSession = request.getSession();
        
        //asignar la lista de personas tratida de la BD
        miSession.setAttribute("listaPersonas",listaPersonas );
        
        //pasar la lista a otro JSP o Servlets
        
        response.sendRedirect("verPersonas.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String dni = request.getParameter("dni");
        String apellido = request.getParameter("apellido");
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        
       Persona pers = new Persona(0, dni, apellido, nombre, telefono);
       control.crearPersona(pers);
       
       //para que no quede pantalla blanca despues del alta
       
       response.sendRedirect("index.jsp");
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
