
package Practica1;

import java.util.Scanner;

public class Principal {

    Scanner lectura=new Scanner(System.in);
      public static void main(String[] args) {
        Evento e = new Evento();
        e.setFecha("10");
        e.setHora("11");
        e.setLugar("mexico");
        e.setCapacidad("500");
        e.setCostoBoleto(12.2546498);
        
        System.out.println("la fecha es:"+e.getFecha());
        System.out.println("la hora es:"+e.getHora());
        System.out.println("El lugar  es:"+e.getLugar());
        System.out.println("la capacidad es:"+e.getCapacidad());
        System.out.println("El costo boleto es:"+e.getCostoBoleto());
    

    }
}

    



/* 
package Practica1;


//las clases tienen atributos(variables) y metodos 

*/