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
public class MenuAdmin {
    public void Menu(){
    int opMenuAdmin = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU DE EMPLEADOS \n "
                    + "Ingrese una opcion \n"
                    + "1. Productos"
                    + "2. Empleados"
                    + "3. Clientes"
                    + "4. Proveedores"
                    + "5. Descuentos"
                    + "6. Volver al Menu Principal"));
    Compra objeto= new Compra();
        Empleados objeto2= new Empleados();
        Promocion objeto3= new Promocion();
        Proveedor objeto4= new Proveedor();
        Zapatos objeto5= new Zapatos();
        Descuento objeto6=new Descuento();
        Cliente objeto7= new Cliente();
            do{
                    switch(opMenuAdmin){
                        case 1: 
                            int opMenuProductos = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU DE PRODUCTOS \n "
                            + "Ingrese una opcion \n"
                            + "\n 1. Ingresar Productos"
                            + "\n 2. Modificar Producto"
                            + "\n 3. Mostrar 1 Producto"
                            + "\n 4. Eliminar Producto"
                            + "\n 5. Lista de productos"));
                            switch(opMenuProductos){
                                case 1: 
                                    objeto5.ingresarUnidad();
                                    JOptionPane.showMessageDialog(null, "Producto Ingresado");
                                break;
                                case 2: 
                                    objeto5.ingresarUnidad();
                                    JOptionPane.showMessageDialog(null, "Producto Modificado");
                                break;
                                case 3: 
                                    objeto5.buscarUnidad();
                                break;
                                case 4:
                                    objeto5.eliminarUnidad();
                                    JOptionPane.showMessageDialog(null, "Producto Eliminado");
                                break;
                                case 5:
                                    JOptionPane.showMessageDialog(null, "Tennis"
                                     +"\nZapato de vestir\nZapato de tacón\nSandalias\n Botas");
                                break;
                                case 6: 
                                    
                                break;
                            }
                        break;
                        
                        case 2:
                             
                            int opMenuEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU DE EMPLEADOS \n "
                            + "Ingrese una opcion \n"
                            + "\n 1. Ingresar Empleado"
                            + "\n 2. Modificar Empleado"
                            + "\n 3. Consultar Empleado"
                            + "\n 4. Eliminar Empleado"
                            + "\n 5. Lista de Emppleados"));
                            
                            switch(opMenuEmpleados){
                                case 1:
                                    objeto2.ingresarPersonal();
                                    JOptionPane.showMessageDialog(null, "Empleadoo Ingresado");
                                break;
                                case 2: 
                                    objeto2.ingresarPersonal();
                                    JOptionPane.showMessageDialog(null, "Empleado Modificado");
                                break;
                                case 3: 
                                    JOptionPane.showMessageDialog(null, "Datos de Empleado");
                                break;
                                case 4:
                                    objeto2.eliminarPersonal();
                                    JOptionPane.showMessageDialog(null, "Empleado Eliminado");
                                break;
                                case 5: 
                                    objeto2.listaEmpleados();
                                break;
                                case 6: 
                                    JOptionPane.showMessageDialog(null, "Salir");
                                break;
                            }
                        break;
                        
                        case 3: 
                            int opMenuCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU DE CLIENTES \n "
                            + "Ingrese una opcion \n"
                            + "\n 1. Ingresar Cliente"
                            + "\n 2. Modificar Cliente"
                            + "\n 3. Consultar Cliente"
                            + "\n 4. Eliminar Cliente"
                            + "\n 5. Lista de Clientes"));

                            switch(opMenuCliente){
                                case 1: 
                                    objeto7.crearCliente();
                                    JOptionPane.showMessageDialog(null, "Cliente Ingresado");
                                break;
                                case 2: 
                                    objeto7.editarCliente();
                                    JOptionPane.showMessageDialog(null, "Cliente Modificado");
                                break;
                                case 3: 
                                    JOptionPane.showMessageDialog(null, objeto7.cedula+objeto7.telefono+objeto7.correo+objeto7.dirección+objeto7.nombre+objeto7.sexo);
                                break;
                                case 4: 
                                    objeto7.eliminarCliente();
                                    JOptionPane.showMessageDialog(null, "Cliente Eliminado");
                                break;
                                case 5: 
                                    objeto7.listaDeClientes();
                                break;
                                case 6: 
                                    JOptionPane.showMessageDialog(null, "Salir");
                                break;
                            }
                        break;
                        
                        case 4: 
                            int opMenuProveedores = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU DE PROVEEDORES \n "
                            + "Ingrese una opcion \n"
                            + "\n 1. Ingresar Proveedor"
                            + "\n 2. Modificar Proveedor"
                            + "\n 3. Consultar Proveedor"
                            + "\n 4. Eliminar Proveedor"
                            + "\n 5. Lista de Proveedores"));

                            switch(opMenuProveedores){
                                case 1: 
                                    objeto4.ingresarProveedor();
                                    JOptionPane.showMessageDialog(null, "Proveedor Ingresado");
                                break;
                                case 2: 
                                    objeto4.editarProveedor();
                                    JOptionPane.showMessageDialog(null, "CProveedor Modificado");
                                break;
                                case 3: 
                                    
                                    JOptionPane.showMessageDialog(null, "Datos de Proveedor");
                                break;
                                case 4: 
                                    objeto4.eliminarProveedor();
                                    JOptionPane.showMessageDialog(null, "Proveedor Eliminado");
                                break;
                                case 5:
                                    objeto4.listaDeProveedores();
                                break;
                                case 6: 
                                    JOptionPane.showMessageDialog(null, "Salir");
                                break;
                            }
                        break;
                        
                        case 5: 
                            int opMenuTransacciones = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU DE DESCUENTOS \n "
                            + "Ingrese una opcion \n"
                            + "\n 1. Crear DESCUENTOS"
                            +"\n2. Eliminar DESCUENTOS"
                            + "\n 3. Lista de DESCUENTOS"));

                            switch(opMenuTransacciones){
                                
                                case 1: 
                                    objeto6.agregarDescuento();
                                    JOptionPane.showMessageDialog(null, "Descuento Ingresado");
                                break;
                                case 2:
                                    objeto6.eliminarDescuento();
                                    JOptionPane.showMessageDialog(null, "Descuento Eliminado");
                                    break;
                                case 3: 
                                    objeto6.listaDeDescuentos();
                                break;
                            }
                        break;
                    }
                    opMenuAdmin = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU DE EMPLEADOS \n "
                    + "Ingrese una opcion \n"
                    + "1. Productos"
                    + "2. Empleados"
                    + "3. Clientes"
                    + "4. Proveedores"
                    + "5. Descuentos"
                    + "6. Volver al Menu Principal"));
}while(opMenuAdmin!=6);
            
}
}
