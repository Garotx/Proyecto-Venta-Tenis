/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ventatenis;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Proveedor {
    
    public  int númeroCedula;
    public  String nombre;
    public  int telefono;
    public  String direccion; 

    public int getNúmeroCedula() {
        return númeroCedula;
    }

    public void setNúmeroCedula(int númeroCedula) {
        this.númeroCedula = númeroCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdZapato() {
        return idZapato;
    }

    public void setIdZapato(int idZapato) {
        this.idZapato = idZapato;
    }

    public String[] getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String[] nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    public  int idZapato;
    public String nombreProveedor[]=new String[5];//Arreglo 4
    public void llenararreglo(){
        nombreProveedor[0]="tommy";
        nombreProveedor[1]="";
        nombreProveedor[2]="";
        nombreProveedor[3]="";
        nombreProveedor[4]="";
    }
    public void ingresarProveedor(){
        Scanner leer=new  Scanner(System.in);
        System.out.println("Ingrese el número de cédula");
        númeroCedula=leer.nextInt();
        nombre= JOptionPane.showInputDialog("Ingrese el nombre completo");
        System.out.println("Ingrese el número de télefono");
        telefono=leer.nextInt();
        direccion= JOptionPane.showInputDialog("Ingrese la dirección");
        System.out.println("Ingrese el número de id de zapato");
        idZapato=leer.nextInt();
        System.out.println("Ingrese el número de proveedor");
        int i=leer.nextInt();
       nombreProveedor[i]=nombre;
    }
    
    public void editarProveedor(){
         Scanner leer=new  Scanner(System.in);
        System.out.println("Ingrese el número de cédula");
        númeroCedula=leer.nextInt();
        nombre= JOptionPane.showInputDialog("Ingrese el nombre completo");
        System.out.println("Ingrese el número de télefono");
        telefono=leer.nextInt();
        direccion= JOptionPane.showInputDialog("Ingrese la dirección");
        System.out.println("Ingrese el número de id de zapato");
        idZapato=leer.nextInt();
        System.out.println("Ingrese el número de proveedor");
        int i=leer.nextInt();
       nombreProveedor[i]=nombre;
    }
    public void eliminarProveedor(){
        Scanner leer=new  Scanner(System.in);
        System.out.println("Ingrese el número de cédula");
        númeroCedula=leer.nextInt();
        nombre= JOptionPane.showInputDialog("Ingrese el nombre completo");
        System.out.println("Ingrese el número de télefono");
        telefono=leer.nextInt();
        System.out.println("Ingrese el número de id de zapato");
        direccion= JOptionPane.showInputDialog("Ingrese la dirección");
        idZapato=leer.nextInt();
        System.out.println("Ingrese el número de proveedor");
        int i=leer.nextInt();
       nombreProveedor[i]="";
    }
     public void listaDeProveedores(){
       for(int i=0; i<5;i++){
           JOptionPane.showMessageDialog(null, nombreProveedor[i]);
       }
     }
}
