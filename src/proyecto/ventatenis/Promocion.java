/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ventatenis;

import java.util.Scanner;


/**
 *
 * @author jrhodenx
 */
public class Promocion {
   public int totalPromo;
public void Promociones(){
    Scanner leer= new Scanner(System.in);
    System.out.println("Estás son las pronociones disponibles:\n1. 2x1 En tennis champion"
    +"\n2. Zapatos de Tacon y zapato de vestir por 30000   ");
    int opcion=leer.nextInt();
    int opcioncolor;
    String color="";
    switch(opcion){
        case 1:
           System.out.println("Ingrese la talla"); 
                   int talla=leer.nextInt();
                    System.out.println("Ingrese el color del zapato:" +
                    "\n1. Celeste\n2. negro\n3. Blanco \n4. Amarillo neon");
                    opcioncolor=leer.nextInt();
                    if(opcioncolor==1){
                        color="Celeste";
                        
                    }
                    else if(opcioncolor==2){
                        color="Negro";
                    }
                    else if(opcioncolor==3){
                        color="Blanco";
                    }
                    else if(opcioncolor==4){
                        color="Amarillo neon";
                    }
                    else{
                        System.out.println("Usted no eligió un color valido, no se pudo efectuar su compra");
                }
                System.out.println("Usted eligió 2 tenis Champions de color: "+color +" "+
                   "Y de talla: "+talla);
                totalPromo=totalPromo+16000;
                break;
        case 2: 
            System.out.println("Zapatos de tacón");
            System.out.println("Ingrese la talla"); 
            talla=leer.nextInt();
            System.out.println("Ingrese el color del zapato:\n"
                +"\n1. café\n2. negro\n3. plateados");
            opcioncolor=leer.nextInt();
            if(opcioncolor==1){
                        color="Café";
                    }
            else if(opcioncolor==2){
                        color="Negro";
                    }
            else if(opcioncolor==3){
                        color="Plateados";
                    }
            else{
                        System.out.println("Usted no eligió un color valido, no se pudo efectuar su Promoción"); 
                        totalPromo=totalPromo-30000;
                    }  
        System.out.println("Usted eligió zapatos de tacón de color: "+color+" "
        +"Y de talla: "+talla); 
            System.out.println("Zapatos de vestir");
         System.out.println("Ingrese la talla"); 
         talla=leer.nextInt();
            System.out.println("Ingrese el color del zapato:\n"
                +"\n1. café\n2. negro\n3. Azul");
            opcioncolor=leer.nextInt();
            if(opcioncolor==1){
                        color="Café";
                    }
            else if(opcioncolor==2){
                        color="Negro";
                    }
            else if(opcioncolor==3){
                        color="Azul";
                    }
            else{
                        System.out.println("Usted no eligió un color valido, no se pudo efectuar su compra");
                    } 
            System.out.println("Usted eligió zapatos de vestir de color: "+color+" "
        +"Y de talla: "+talla); 
            totalPromo=totalPromo+30000;
            break;
        }
    System.out.println("El total en las promociones es de:"+totalPromo);
    }

    public int getTotalPromo() {
        return totalPromo;
    }

    public void setTotalPromo(int totalPromo) {
        this.totalPromo = totalPromo;
    }
    }
        
    
             





