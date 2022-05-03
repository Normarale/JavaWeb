

<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos de la Persona</h1>
    
        <form action="SvEditar" method="Post">
        <% HttpSession miSesion = request.getSession();
           Persona pers = (Persona) miSesion.getAttribute("persona");
   {%>
   
   
  <div class = input-group>
      <label> DNI: </label> <input type="text" name="dni" value="<%= pers.getDni() %>">
   </div>    
           
   
   <div class = input-group>
       <label> Nombre: </label> <input type="text"  name="nombre" value="<%=pers.getNombre()%>">
   </div>    
   
   <div class = input-group>
       <label> Apellido: </label> <input  type="text" name="apellido" value="<%=pers.getApellido() %>">
   </div>    
           
   <div class = input-group>
       <label> Teléfono: </label> <input type="text" name="telefono" value="<%=pers.getTelefono() %>">
   </div>    
   
      <input type ="hidden"  name="id"  value="<%=pers.getId()%>"> 
      
   <br>   
   <br>
   
            <button type="submit">MODIFICAR</button>
    </form>
        
   
         
                
         
       
        
    <%}%>    
    
            
    </body>
</html>
