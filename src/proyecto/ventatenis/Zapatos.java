/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ventatenis;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Zapatos {
    public int idZapato=23456;
    public  String estilo;

    public int getIdZapato() {
        return idZapato;
    }

    public void setIdZapato(int idZapato) {
        this.idZapato = idZapato;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String[] getProducto() {
        return producto;
    }

    public void setProducto(String[] producto) {
        this.producto = producto;
    }
    public  String color;
    public  int talla;
    public  String marca;
    public String producto[]=new String[100];//Arreglo 2
    public void buscarUnidad(){
    int busqueda=JOptionPane.showConfirmDialog(null, "Ingrese el número de busqueda de zapato");
        System.out.println("Este es tu producto"+ producto[busqueda]);
    }
    
    public void ingresarUnidad(){
        Scanner leer=new  Scanner(System.in);
       estilo= JOptionPane.showInputDialog("Ingrese el estilo");
       color= JOptionPane.showInputDialog("Ingrese el color");
        System.out.println("Ingrese la talla");
       talla=leer.nextInt();
       marca=JOptionPane.showInputDialog("Ingrese la marca");
        System.out.println("Ingrese el número del zapato");
       int i=leer.nextInt();
       producto[i]=estilo;
    }
      
    public void eliminarUnidad(){
        Scanner leer=new  Scanner(System.in);
    estilo= JOptionPane.showInputDialog("Ingrese el estilo");
    color= JOptionPane.showInputDialog("Ingrese el color");
    System.out.println("Ingrese la talla");
       talla=leer.nextInt();
    marca=JOptionPane.showInputDialog("Ingrese la marca");
    System.out.println("Ingrese el número de zapato");
       int i=leer.nextInt();
       producto[i]="";
    } 
    }