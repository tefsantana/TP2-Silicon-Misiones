/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica;

import igu.Principal;

public class TPDos {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        Principal princ = new Principal(control);
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
    
}
