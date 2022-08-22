package Practica01a_RodriguezPonceEdnaJaretzi;

import java.util.*; 
public class Principal {
     
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        int x;
        String fechaPersona="";
        String lugarPersona="";
        String horaPersona="";
        int capacidadPersona=0;
        double costoBoletoPersona=0;
        Scanner entrada=new Scanner(System.in);
        Scanner lectura=new Scanner(System.in);

      
        do {
        System.out.println("1.-Introducir datos:"); 
        System.out.println("2.-Editar");
        System.out.println("3.-Imprimir");
        x=entrada.nextInt();


        switch (x) {
            case 1:
            System.out.println("Introduce una Fecha:");
            fechaPersona=lectura.nextLine();
        
            System.out.println("Introduce una Hora:");
            lugarPersona=lectura.nextLine();
         
            System.out.println("Introduce una Lugar:");
            horaPersona=lectura.nextLine();

            System.out.println("Introduce capacidad:");
            capacidadPersona=lectura.nextInt();
            System.out.println("Introduce costo boleto:");
            costoBoletoPersona=lectura.nextInt();
            break;

            case 2:
            System.out.println("Introduce una Fecha:");
            fechaPersona=lectura.nextLine();
        
            System.out.println("Introduce una Hora:");
            lugarPersona=lectura.nextLine();
         
            System.out.println("Introduce una Lugar:");
            horaPersona=lectura.nextLine();

            System.out.println("Introduce capacidad:");
            capacidadPersona=lectura.nextInt();
            System.out.println("Introduce costo boleto:");
            costoBoletoPersona=lectura.nextInt();
            break;

            case 3:
            Evento nuevaPersona=new Evento(fechaPersona,lugarPersona,horaPersona,capacidadPersona, costoBoletoPersona);
            nuevaPersona.setFecha(fechaPersona);
            nuevaPersona.setLugar(lugarPersona);
            nuevaPersona.setHora(horaPersona);
            nuevaPersona.setCapacidad(capacidadPersona);
            nuevaPersona.setCostoBoleto(costoBoletoPersona);

            System.out.println("El DNI es: " + nuevaPersona.getFecha());
            System.out.println("El nombre es: " + nuevaPersona.getLugar());
            System.out.println("La edad es: " + nuevaPersona.getHora());
            System.out.println("La capacidad es: " + nuevaPersona.getCapacidad()); 
            System.out.println("La costo boleto es: " + nuevaPersona.getCostoBoleto());  
            break;
            default:
            break;
        }
        }while(!"4".equals(x));
    }
}