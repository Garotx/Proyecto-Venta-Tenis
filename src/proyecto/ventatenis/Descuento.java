

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ventatenis;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Descuento {
    String descuento[]=new String[2];
    int idCompra;
    String Des;
    public void llenaDescuentos(){
       descuento[0]="Zapato Champion a su elección a 6000";
       descuento[1]="Sandalias a 7000";
    }
     public void listaDeDescuentos(){
       for(int i=0; i<2;i++){
           JOptionPane.showMessageDialog(null, descuento[i]);
    }
    }

    public String[] getDescuento() {
        return descuento;
    }

    public void setDescuento(String[] descuento) {
        this.descuento = descuento;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String Des) {
        this.Des = Des;
    }
     public void agregarDescuento(){
         Scanner leer=new Scanner(System.in);
         Des= JOptionPane.showInputDialog("Ingrese el tipo de Descuento");
         System.out.println("Ingrese el número de descuento");
        int i=leer.nextInt();
         descuento[i]=Des;
     }
     public void eliminarDescuento(){
          Scanner leer=new Scanner(System.in);
          System.out.println("Ingrese el número de descuento");
        int i=leer.nextInt();
         descuento[i]="";
     }
}
