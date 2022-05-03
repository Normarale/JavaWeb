<%-- 
    Document   : index
    Created on : 22 feb. 2022, 10:44:20
    Author     : marva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos de la Persona</h1>
        <form action="SvPersona " method="POST">
            <p><label>DNI: <input type="text" name="dni"></p>
            <p><label>Nombre: <input type="text" name="nombre"></p>  
            <p><label>Apellido: <input type="text" name="apellido"></p>    
            <p><label>Telefono: <input type="text" name="telefono"></p> 
            <button type="submit"   > Enviar</button>    
        </form>
        
        <h1>Ver Lista de Personas</h1>
        <p> Si desea ver toda la lista de personas haga click en el botón Mostrar</p>
        <form action="SvPersona" method="GET">
            <button type="submit" >Mostrar</button>     
        </form>
        
        <h1>Eliminar Personas</h1>
        <p> Ingrese Id de la persona a eliminar</p>
        <form action="SvEliminar" method="POST">
            <p><label>Id: </label><input type="text" name="id_eliminar" ></p>
            <button type="submit" >Eliminar</button>     
        </form>
        
        <h1>Editar Personas</h1>
        <p> Ingrese Id de la persona a modificar</p>
        <form action="SvEditar" method="Get">
            <p><label>Id: </label><input type="text" name="id" ></p>
            <button type="submit">Editar</button>     
        </form>
        
    </body>
</html>
