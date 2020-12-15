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
public class Compra {
 public int idCompra=19263;
 public int idCliente;
 public String entidadBancaria;
 public int zapato;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public int getZapato() {
        return zapato;
    }

    public void setZapato(int zapato) {
        this.zapato = zapato;
    }

    public int getZapatoDevolver() {
        return zapatoDevolver;
    }

    public void setZapatoDevolver(int zapatoDevolver) {
        this.zapatoDevolver = zapatoDevolver;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int[] getFactura() {
        return factura;
    }

    public void setFactura(int[] factura) {
        this.factura = factura;
    }

    public String[] getArticulo() {
        return articulo;
    }

    public void setArticulo(String[] articulo) {
        this.articulo = articulo;
    }
 public int zapatoDevolver;
  public int total;
 public int talla;
 public String color;
 
 public int factura[]=new int[8];
 public String articulo []=new String[8];
 public void llenarArreglos(){
     factura[0]=15748;
     factura[1]=118954;
     factura[2]=9541;
     factura[3]=9652;
     factura[4]=4985;
     factura[5]=9574;
     factura[6]=9654;
     factura[7]=9654;
     articulo[0]="tennis";
     articulo[1]="sandalias";
     articulo[2]="tennis";
     articulo[3]="botas";
     articulo[4]="de vestir";
     articulo[5]="tacones";
     articulo[6]="tennis";
     articulo[7]="tennis";
 }
public void eliminarCompra(){
    total=0;
} 
 public void ingresarCompra(){
int cobro=0 ;
     Scanner leer= new Scanner(System.in);
     String NombreZapato="";
     System.out.println("Ingree su número de cliente");
     idCliente= leer.nextInt();
     System.out.println("Ingrese el tipo de zapato:\n1.Tennis"
     +"\n2.Zapato de vestir\n3.Zapato de tacón\n4.Sandalias\n5. Botas");
     zapato=leer.nextInt();
     int opcion;
        int opcioncolor=0;
       
     if(zapato==1){ 
         System.out.println("Estas son nuestras marcas:\n1.Nike\n2.Adidas\n3.Vans");
             NombreZapato="Tennis";
             opcion=leer.nextInt();
        if(opcion==1){
                System.out.println("Esa marca tiene un precio de: 28000\n"
                +"¿Desea seguir con su compra?\n1. Si\n2. No"); 
                if(leer.nextInt()==1){
                    System.out.println("Ingrese la talla"); 
                    talla=leer.nextInt();
                    System.out.println("Ingrese el color del zapato:\n"
                    +"\n1. azul\n2. negro\n3. blanco\n4. gris");
                    opcioncolor=leer.nextInt();
                    if(opcioncolor==1){
                        color="Azul";
                        cobro=cobro+28000;
                    }
                    else if(opcioncolor==2){
                        color="Negro";
                        cobro=cobro+28000;
                    }
                    else if(opcioncolor==3){
                        color="Blanco";
                        cobro=cobro+28000;
                    }
                    else if(opcioncolor==4){
                        color="Gris";
                        cobro=cobro+28000;
                    }
                    else{
                        System.out.println("Usted no eligió un color valido, no se pudo efectuar su compra");  
                    }
                System.out.println("Usted eligió tennis de marca Nike de color: "+color +" "
        +"Y de talla: "+talla);
                }
            else if(zapato==2){
             System.out.println("Esa marca tiene un precio de:20000 \n"
                +"¿Desea seguir con su compra?\n1. Si\n2. No"); 
                if(leer.nextInt()==1){
                    System.out.println("Ingrese la talla"); 
                    talla=leer.nextInt();
                    System.out.println("Ingrese el color del zapato:\n"
                    +"\n1. gris\n2. negro\n3. blanco");
                    opcioncolor=leer.nextInt();
                    if(opcioncolor==1){
                        color="Gris";
                        cobro=cobro+20000;
                    }
                    else if(opcioncolor==2){
                        color="Negro";
                        cobro=cobro+20000;
                    }
                    else if(opcioncolor==3){
                        color="Blanco";
                        cobro=cobro+20000;
                    }
                    else{
                        System.out.println("Usted no eligió un color valido, no se pudo efectuar su compra");  
                    }
                    }
                System.out.println("Usted eligió tennis de marca Adidas de color: "+color +" "
        +"Y de talla: "+talla);
            }
                
            else if(zapato==3){
             System.out.println("Esa marca tiene un precio de:25000 \n"
                +"¿Desea seguir con su compra?\n1. Si\n2. No"); 
                if(leer.nextInt()==1){
                    System.out.println("Ingrese la talla"); 
                    talla=leer.nextInt();
                    System.out.println("Ingrese el color del zapato:\n"
                    +"\n1. gris\n2. negro\n3. rojo\n4. azul");
                    opcioncolor=leer.nextInt();
                    if(opcioncolor==1){
                        color="Gris";
                        cobro=cobro+25000;
                    }
                    else if(opcioncolor==2){
                        color="Negro";
                        cobro=cobro+25000;
                    }
                    else if(opcioncolor==3){
                        color="Rojo";
                        cobro=cobro+25000;
                    }
                    else if(opcioncolor==4){
                        color="Azul";
                        cobro=cobro+25000;
                    }
                    else{
                        System.out.println("Usted no eligió un color valido, no se pudo efectuar su compra");  
                    }
                }
                System.out.println("Usted eligió tenis Vans de color: "+color +" "
        +"Y de talla: "+talla);
                    }
                else{
                    System.out.println("No elijó una opción correcta");
                }
        }
        }
     System.out.println("Estos tienen un valor de: 18000\n¿Desea seguir con la compra?" +"\n1. Si\n2. No");
        if(zapato==2){
            NombreZapato="De vestir";
        
               
        opcion=leer.nextInt();         
        if(opcion==1){ 
            System.out.println("Ingrese la talla"); 
            talla=leer.nextInt();
            System.out.println("Ingrese el color del zapato:\n"
                +"\n1. café\n2. negro\n3. Azul");
            opcioncolor=leer.nextInt();
            if(opcioncolor==1){
                        color="Café";
                        cobro=cobro+18000;
                    }
            else if(opcioncolor==2){
                        color="Negro";
                        cobro=cobro+18000;
                    }
            else if(opcioncolor==3){
                        color="Azul";
                        cobro=cobro+18000;
                    }
            else{
                        System.out.println("Usted no eligió un color valido, no se pudo efectuar su compra");  
                    }  
        }
        System.out.println("Usted eligió zapatos de vestir de color: "+color+" "
        +"Y de talla: "+talla);
        }
         if(zapato==3){
             NombreZapato="De tacón";
        System.out.println("Estos tienen un valor de: 16000\n¿Desea seguir con la compra?"
                +"\n1. Si\n. No");
        opcion=leer.nextInt();        
        if(opcion==1){ 
            System.out.println("Ingrese la talla"); 
            talla=leer.nextInt();
            System.out.println("Ingrese el color del zapato:\n"
                +"\n1. café\n2. negro\n3. plateados");
            opcioncolor=leer.nextInt();
            if(opcioncolor==1){
                        color="Café";
                        cobro=cobro+16000;
                    }
            else if(opcioncolor==2){
                        color="Negro";
                        cobro=cobro+16000;
                    }
            else if(opcioncolor==3){
                        color="Plateados";
                        cobro=cobro+16000;
                    }
            else{
                        System.out.println("Usted no eligió un color valido, no se pudo efectuar su compra");  
                    }  
        }
        System.out.println("Usted eligió zapatos de tacón de color: "+color+" "
        +"Y de talla: "+talla);
         }
         if(zapato==4){
             NombreZapato="sandalias";
        System.out.println("Estos tienen un valor de: 12000\n¿Desea seguir con la compra?"
                +"\n1. Si\n. No");
        opcion=leer.nextInt();    
        if(opcion==1){ 
            System.out.println("Ingrese la talla"); 
            talla=leer.nextInt();
            System.out.println("Ingrese el color del zapato:\n"
                +"\n1. café\n2. negro\n3. rojo");
            opcioncolor=leer.nextInt();
            if(opcioncolor==1){
                        color="Café";
                        cobro=cobro+12000;
                    }
            else if(opcioncolor==2){
                        color="Negro";
                        cobro=cobro+12000;
                    }
            else if(opcioncolor==3){
                        color="Rojo";
                        cobro=cobro+12000;
                    }
            else{
                        System.out.println("Usted no eligió un color valido, no se pudo efectuar su compra");  
                    }  
        }
        System.out.println("Usted eligió sandalias de color: "+color+" "
        +"Y de talla: "+talla);  
         }
         if(zapato==5){
        System.out.println("Estos tienen un valor de: 26000\n¿Desea seguir con la compra?"
                +"\n1. Si\n. No");
        opcion=leer.nextInt();    
        if(opcion==1){ 
            NombreZapato="Botas";
            System.out.println("Ingrese la talla"); 
            talla=leer.nextInt();
            System.out.println("Ingrese el color del zapato:\n"
                +"\n1. vino\n2. negro\n3. beige");
            opcioncolor=leer.nextInt();
            if(opcioncolor==1){
                        color="Vino";
                        cobro=cobro+26000;
                    }
            else if(opcioncolor==2){
                        color="Negro";
                        cobro=cobro+26000;
                    }
            else if(opcioncolor==3){
                        color="Beige";
                        cobro=cobro+26000;
                    }
            else{
                        System.out.println("Usted no eligió un color valido, no se pudo efectuar su compra");  
                    }  
        }
        System.out.println("Usted eligió botas de color: "+color+" "
        +"Y de talla: "+talla);
         
        }
         int talla=this.talla;
         String color=this.color;
     System.out.println("El valor por pagar es: "+cobro);
     System.out.println("Ingrese el número de compra");
     int i=leer.nextInt();
     factura[i]= cobro;
     articulo[i]= "Usted eligió zapatos "+NombreZapato+" de talla: "+talla+" y de color: "+ color;
     }
      public  void verLista(){
     for(int i=0; i<8;i++){
         System.out.println(articulo[i]);
         System.out.println("\nCon un costo de: "+factura[i]);
     }
     }

    public void realizarDevolución(){
     Scanner leer= new Scanner(System.in);
     System.out.println("Ingrese el número del zapato que desea devolver\n1.Tennis"
     +"\n2.Zapato de vestir\n3.Zapato de tacón\n4.Sandalias\n5. Botas");
     zapatoDevolver=leer.nextInt();
 }
 public void cancelarDevolucion(){
     Scanner leer= new Scanner(System.in);
     System.out.println("Está seguro que desea cancelar la devolución\n1.Si\n2.No");
     int opcion=leer.nextInt();
     if(opcion==1){
         zapatoDevolver=0;
     }
 }
}


