
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    //creamos una isntancia
    PersonaJpaController persJPA = new PersonaJpaController();
    
    //colocamos los métodos para abm
    
    public void crearPersona(Persona per){
        persJPA.create(per);
    }
    
    
    public void eliminarPersona(int id){
        try {
            persJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //otra opcion para eliminar un registro persona es recibiendo la persona completa
    
    public void eliminarpersona(Persona pers){
        try {
            persJPA.destroy(pers.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //para la lectura al ser una funcion me retorna algo
    
    public List <Persona> traerPersonas (){
       return persJPA.findPersonaEntities();
}
    
    
    public void Editar(Persona pers){
        try{
            persJPA.edit(pers);
        }catch(Exception ex){
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        
     
    public Persona Buscar(int id){
            
       Persona pers = persJPA.findPersona(id);
           return pers;              
       
    }   
}
