/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearCliente(String num_cliente, String nombre_perro, String raza, String color, String alergico, String atencion_especial, String nombre_duenio, String celular_duenio, String observaciones) {
        
        Cliente clie = new Cliente();
        clie.setNum_cliente(num_cliente);
        clie.setNombre_perro(nombre_perro);
        clie.setRaza(raza);
        clie.setColor(color);
        clie.setAlergico(alergico);
        clie.setAtencion_especial(atencion_especial);
        clie.setNombre_duenio(nombre_duenio);
        clie.setCelular_duenio(celular_duenio);
        clie.setObservaciones(observaciones);
        
        controlPersis.crearCliente(clie);
        
    }
    
    public void crearCliente(Cliente clie) {
        controlPersis.crearCliente(clie);
    }
    
    public void bajaCliente(Cliente clie) {
        controlPersis.eliminarCliente(clie);
    }
    
    public void bajaCliente(int id) {
        controlPersis.eliminarCliente(id);
    }
    
    public List<Cliente> traerClientes() {
        return controlPersis.obtenerClientes();
    }
    
    public void modificarCliente(Cliente clie) {
        controlPersis.modificarCliente(clie);
    }
    
    public Cliente buscarCliente(Cliente clie) {
        return controlPersis.buscarCliente(clie);
    }
    
    public Cliente buscarCliente(int id) {
        return controlPersis.buscarCliente(id);
    }
}
