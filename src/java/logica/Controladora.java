
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    //creamos una intancia
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    public void crearPersona(Persona per){
       controlPersis.crearPersona(per);
    }
    
    
    public void eliminarPersona(int id){
        controlPersis.eliminarPersona(id);
    }
    
    //otra opcion para eliminar un registro persona es recibiendo la persona completa
    
    public void eliminarpersona(Persona pers){
        controlPersis.eliminarpersona(pers);
    }
    
    
    //para la lectura al ser una funcion me retorna algo
    
    public List <Persona> traerPersonas (){
       return controlPersis.traerPersonas();
}
    
    public void Editar(Persona pers){
        controlPersis.Editar(pers);
    }
    
    
       
    
    
    public Persona Buscar(int id){
     Persona pers = controlPersis.Buscar(id);
     return pers;
    }   
    
}
