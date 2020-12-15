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
public class Cliente {
    
   public int cedula;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String[] getNombresClientes() {
        return nombresClientes;
    }

    public void setNombresClientes(String[] nombresClientes) {
        this.nombresClientes = nombresClientes;
    }
   public String nombre;
   public String correo;
   public String sexo;
   public String dirección;
   public int telefono;
   public String nombresClientes[]=new String[10];
   
   public void crearCliente(){
       Scanner leer=new  Scanner(System.in);
       System.out.println("Ingrese la cédula");
        cedula=leer.nextInt();
       nombre= JOptionPane.showInputDialog("Ingrese el nombre completo");
       correo=JOptionPane.showInputDialog("Ingrese el correo electrónico");
       sexo=JOptionPane.showInputDialog("Ingrese el sexo");
       System.out.println("Ingrese el número télefonico");
       telefono=leer.nextInt();
        System.out.println("Ingrese el número de cliente");
      int i=leer.nextInt();
       nombresClientes[i]=nombre;//Arreglo 3
   }
   public void listaDeClientes(){
       for(int i=0; i<10;i++){
           JOptionPane.showMessageDialog(null, nombresClientes[i]);
       }
   }
   public void llenarClientes(){
     nombresClientes[0]="tommy";
     nombresClientes[1]="";
     nombresClientes[2]="";
     nombresClientes[3]="";
     nombresClientes[4]="";
     nombresClientes[5]="";
     nombresClientes[6]="";
     nombresClientes[7]="";
     nombresClientes[8]="";
     nombresClientes[9]="";
             
   }
   
   public void ingresarCliente(){
       Scanner leer=new  Scanner(System.in);
        System.out.println("Ingrese la cédula");
        cedula=leer.nextInt();
       nombre= JOptionPane.showInputDialog("Ingrese el nombre completo");
       correo=JOptionPane.showInputDialog("Ingrese el correo electrónico");
       System.out.println("Ingrese el número télefonico");
       telefono=leer.nextInt();
        System.out.println("Ingrese el número de cliente");
       int i=leer.nextInt();
       nombresClientes[i]=nombre;
   }
   
   public void eliminarCliente(){
       Scanner leer=new  Scanner(System.in);
       System.out.println("Ingrese la cédula");
        cedula=leer.nextInt();
       nombre= JOptionPane.showInputDialog("Ingrese el nombre completo");
       correo=JOptionPane.showInputDialog("Ingrese el correo electrónico");
       sexo=JOptionPane.showInputDialog("Ingrese el sexo");
       System.out.println("Ingrese el número télefonico");
       telefono=leer.nextInt();
       System.out.println("Ingrese el número de cliente");
       int i=leer.nextInt();
       nombresClientes[i]="";
   }
   
   public void editarCliente(){
       Scanner leer=new  Scanner(System.in);
       System.out.println("Ingrese la cédula");
        cedula=leer.nextInt();
       nombre= JOptionPane.showInputDialog("Ingrese el nombre completo");
       correo=JOptionPane.showInputDialog("Ingrese el correo electrónico");
       sexo=JOptionPane.showInputDialog("Ingree el sexo");
       System.out.println("Ingrese el número télefonico");
       telefono=leer.nextInt();
        System.out.println("Ingrese el número de cliente");
       int i=leer.nextInt();
       nombresClientes[i]=nombre;
   }
}