/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    ClienteJpaController clieJPA = new ClienteJpaController ();
    
    // método para alta
    
    public void crearCliente(Cliente clie) {
        //try {
        clieJPA.create(clie);
        //}
        //catch (Exception e) {
            //System.out.println("No se pudo crear el cliente.");
        
        //}
    
    }
    // método para baja
    
    public void eliminarCliente(int id) {
        
        try {
            clieJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void eliminarCliente(Cliente clie) {
        
        try {
            clieJPA.destroy(clie.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
    // método para lectura
    
    public List<Cliente> obtenerClientes() {
        
        return clieJPA.findClienteEntities();
    }
    
    // método para modificación
    
    public void modificarCliente(Cliente clie) {
        try {
            clieJPA.edit(clie);
         } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //método para búsqueda
    
    public Cliente buscarCliente(int id) {
        
        return clieJPA.findCliente(id);
        
    }
    
    public Cliente buscarCliente(Cliente clie) {
        
        return clieJPA.findCliente(clie.getId());
        
    }
}
