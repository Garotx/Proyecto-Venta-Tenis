/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ventatenis;

import javax.swing.JOptionPane;
public class ProyectoVentaTenis {
    
    public static void main(String[] args) {
        //Menu Pincipal
       MenuAdmin objeto= new MenuAdmin();
        MenuCliente objeto2= new MenuCliente();
        int opMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion \n "
                + " 1. Menu de Empleado"
                + " 2. Cliente"
                + " 3. Salir"));
        do{
        if(opMenuPrincipal==1){
             objeto.Menu();
        }
            if(opMenuPrincipal==2){
                 objeto2.Menu();
            }
             opMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion \n "
                + " 1. Menu de Empleado"
                + " 2. Cliente"
                + " 3. Salir"));           
        }while(opMenuPrincipal!=3);
        }
}
