/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ventatenis;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MenuCliente {
    public void Menu(){
     int opMenuClientes = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU DE CLIENTES \n "
                    + "Ingrese una opcion \n"
                    + "1. Ver Zapatos"
                    + "2. Efectuar Compra"
                    + "3. Promociones"
                    + "4. Devoluciones"
                    + "5. Volver al Menu Principal")); 
     Compra objeto= new Compra();
        Empleados objeto2= new Empleados();
        Promocion objeto3= new Promocion();
        Proveedor objeto4= new Proveedor();
        Zapatos objeto5= new Zapatos();
        Descuento objeto6=new Descuento();
        Cliente objeto7= new Cliente();
            do{
                       switch(opMenuClientes){
                          case 1: 
                            int opMenuVerZapatos = Integer.parseInt(JOptionPane.showInputDialog(null, "Catalogo de Zapatos \n "
                            + "Ingrese una opcion \n"
                            + "\n 1. Lista de estilos"
                            + "\n 2. Lista de zapatos"
                            + "\n 3. Lista de colores"));

                            switch(opMenuVerZapatos){
                                case 1: 
                                    JOptionPane.showMessageDialog(null, "tennis, de tacón, de vestir, sandalias y botas");
                                break;
                                case 2: 
                                    JOptionPane.showMessageDialog(null, "Zapatos desde tennis hasta de fiesta");
                                break;
                                case 3: 
                                    JOptionPane.showMessageDialog(null, "Negro,Blanco, Gris, Café, Azul, Rojos, Vinos, Beige ");
                                break;
                                case 4:
                                    JOptionPane.showMessageDialog(null, "Salir");
                                break;
                            }
                        break; 
                        
                        case 2: 
                            int opMenuVerCatalogo = Integer.parseInt(JOptionPane.showInputDialog(null, "Catalogo de Compras \n "
                            + "Ingrese una opcion \n"
                            + "\n 1. ID de Compra"
                            + "\n 2. Lista de Productos"
                            + "\n 3. Lista de compras"
                            + "\n 4. Agregar Compra"
                            + "\n 5. Eliminar Compra"));

                            switch(opMenuVerCatalogo){
                                case 1: 
                                    JOptionPane.showMessageDialog(null, objeto.idCompra);
                                break;
                                case 2: 
                                    JOptionPane.showMessageDialog(null, "Tennis\n"+
                                        "Zapatos de vestir\n Zapatos de tacón\n Sandalias\n Botas");
                                break;
                                case 3: 
                                    objeto.verLista();
                                break;
                                case 4:
                                    objeto.ingresarCompra();
                                    JOptionPane.showMessageDialog(null, "Compra Modificada");
                                break;
                                case 5: 
                                    objeto.eliminarCompra();
                                    JOptionPane.showMessageDialog(null, "Compra eliminada");
                                break;
                                case 6: 
                                    JOptionPane.showMessageDialog(null, "Salir");
                                break;
                            }
                        break; 
                        
                        case 3: 
                            int opMenuVerPromociones = Integer.parseInt(JOptionPane.showInputDialog(null, "Catalogo de Promociones \n "
                            + "Ingrese una opcion \n"
                            + "\n 1. ID de Zapato"
                            + "\n 2. Lista de Zapatos en Promocion"
                            + "\n 3. Agregar Zapato"));

                            switch(opMenuVerPromociones){
                                case 1: JOptionPane.showMessageDialog(null, "Id numero"+objeto5.idZapato);
                                break;
                                
                                case 2:
                                    JOptionPane.showMessageDialog(null, "2x1 En tennis champion y Zapatos de Tacon y zapato de vestir por 30000 ");
                                break;
                                case 3: 
                                    objeto3.Promociones();
                                    JOptionPane.showMessageDialog(null, "   Promoción Agregada");
                                break;
                                case 4: JOptionPane.showMessageDialog(null, "Salir");
                                break;
                            }
                        break;
                        
                        case 4: 
                            int opMenuVerDevoluciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Catalogo de Devoluciones \n "
                            + "Ingrese una opcion \n"
                            + "\n 1. ID de Compra"
                            + "\n 2. Modificar Devolucion"
                            + "\n 3. Cancelar Devolucion"));

                            switch(opMenuVerDevoluciones){
                                case 1: 
                                    JOptionPane.showMessageDialog(null, "Id numero: "+ objeto.idCompra);
                                break;
                                case 2:
                                    objeto.realizarDevolución();
                                    JOptionPane.showMessageDialog(null, "Devolucion Modificada");
                                break;
                                case 3: 
                                   objeto.cancelarDevolucion();
                                    JOptionPane.showMessageDialog(null, "Devolucion cancelada");
                                break;
                                case 4: 
                                    JOptionPane.showMessageDialog(null, "Salir");
                                break;
                            }
                       }
                       opMenuClientes = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU DE CLIENTES \n "
                    + "Ingrese una opcion \n"
                    + "1. Ver Zapatos"
                    + "2. Efectuar Compra"
                    + "3. Promociones"
                    + "4. Devoluciones"
                    + "5. Volver al Menu Principal"));
                       break;
                       
                       } while(opMenuClientes!=5);
    }
}
