/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.ventatenis;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Empleados {
    public  int cedula;
    public  String nombre;
    public  int telefono;
    public  int sueldo;
    public String nombresEmpleados[]=new String[10];
    public void llenarArreglo(){
        nombresEmpleados[0]="tommy";
        nombresEmpleados[1]="";
        nombresEmpleados[2]="";
        nombresEmpleados[3]="";
        nombresEmpleados[4]="";
        nombresEmpleados[5]="";
        nombresEmpleados[6]="";
        nombresEmpleados[7]="";
        nombresEmpleados[8]="";
        nombresEmpleados[9]="";
    }

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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String[] getNombresEmpleados() {
        return nombresEmpleados;
    }

    public void setNombresEmpleados(String[] nombresEmpleados) {
        this.nombresEmpleados = nombresEmpleados;
    }
    public void ingresarPersonal(){
        Scanner leer=new  Scanner(System.in);
        System.out.println("Ingrese la cédula");
        cedula=leer.nextInt();
        nombre= JOptionPane.showInputDialog("Ingrese el nombre completo");
        System.out.println("Ingrese el número télefonico");
        telefono=leer.nextInt();
        System.out.println("Ingrese el número de empleado");
       int i=leer.nextInt();
        nombresEmpleados[i]=nombre;//Arreglo 1
    }
    public void listaEmpleados(){
        for(int i=0;i<10;i++){
           JOptionPane.showMessageDialog(null, nombresEmpleados[i]);
        }
    }
    public void eliminarPersonal(){
        Scanner leer=new  Scanner(System.in);
        System.out.println("Ingrese la cédula");
        cedula=leer.nextInt();
        nombre= JOptionPane.showInputDialog("Ingrese el nombre completo");
        System.out.println("Ingrese el número télefonico");
        telefono=leer.nextInt();
        System.out.println("Ingrese el número de empleado");
       int i=leer.nextInt();
        nombresEmpleados[i]="";//Arreglo 1
    }
    
    public void pagarPersonal(){
        Scanner leer=new  Scanner(System.in);
        System.out.println("Ingrese el número de empleado");
       int i=leer.nextInt();
       String nom= nombresEmpleados[i];
        sueldo=JOptionPane.showConfirmDialog(null, "Ingrese el sueldo");
        System.out.println("Ya le pagó a: "+nom);
    }
}
