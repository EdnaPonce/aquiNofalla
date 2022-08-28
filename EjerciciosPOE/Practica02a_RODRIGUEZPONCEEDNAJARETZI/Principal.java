package EjerciciosPOE.Practica02a_RODRIGUEZPONCEEDNAJARETZI;
import java.util.Scanner;

public class Principal {
    private static int a;
    private static int b;


    public static void main(String[] args) {
        int opcion = 4;
        Scanner leer =new Scanner(System.in);
     

        Dispositivo d[]=new Dispositivo[20];
        String nombre="";
        String modelo="";
        String material="";
        
    do{
             System.out.println("\n\t1. La opcion de registrar");
             System.out.println("\n\t2. La opcion de buscar y editar");
             System.out.println("\n\t3. La opcion de imprimir");
             System.out.println("\n\t4. salir de la aplicacion");
             opcion = leer.nextInt();

             switch(opcion)
             {
                case 1:
                    System.out.println("\n\n\tUsted eligio la opcion de registrar");
                    for(int i=0;i<d.length;i++) 
                        {
                            System.out.println("                               ");
                            nombre=leer.nextLine();
                            System.out.println("Ingresa nombre del dispositivo:");
                            nombre=leer.nextLine();
                            System.out.println("Ingresa material del dispositivo:");
                            material=leer.nextLine();
                            System.out.println("Ingresa modelo del dispositivo:");
                            modelo=leer.nextLine();
                            d[i]= new Dispositivo(nombre,modelo,material);
                        }
                break;
               
                case 2:
                
                System.out.println("1.-Buscar por dispositivos ");
                System.out.println("2.-Buscar por material ");
                System.out.println("3.-Buscar por nombre ");
                a = leer.nextInt();

                if (a == 1){
                    System.out.println("Buscar por modelo ");
                    
                    for(int i=0;i<d.length;i++) 
                    {
                    System.out.println("  "+d[i].getmodelo()+"  ");
                    }
                    System.out.println("Desea modificarlos Y-->1/No--->Enter");
                     b = leer.nextInt();
                
                    if(b==1){

                    for(int i=0;i<d.length;i++) 
                    {
                        modelo=leer.nextLine();
                        System.out.println("                               ");
                        System.out.println("Ingresa nuevos modelos :");
                        modelo=leer.nextLine();
                        System.out.println("                               ");
                        d[i]= new Dispositivo(nombre,modelo,material);
                    }

                }
              
                }else if(a==2)
                {
                    System.out.println("Buscar por material ");
                    for(int i=0;i<d.length;i++) 
                    {
                     System.out.println(d[i].getmeterial()+"  ");
                    }
                    System.out.println("Desea modificarlos Y-->1/N-->2 ");
                     b = leer.nextInt();
                     if(b==1){

                        for(int i=0;i<d.length;i++) 
                        {
                            material=leer.nextLine();
                            System.out.println("Ingresa nuevos materiales :");
                            material=leer.nextLine();
                            System.out.println("                               ");
                            d[i]= new Dispositivo(nombre,modelo,material);
                        }
                }
                }   
                else if(a==3)
                {
                    System.out.println("Buscar por nombre ");
                    for(int i=0;i<d.length;i++) 
                {
                System.out.println(d[i].getnombre()+"  ");
                }
                System.out.println("Desea modificarlos Y-->1/N-->2 ");
                     b = leer.nextInt();
                     if(b==1){

                        for(int i=0;i<d.length;i++) 
                        {
                            nombre=leer.nextLine();
                            System.out.println("                               ");
                            System.out.println("Ingresa nuevos nombres :");
                            nombre=leer.nextLine();
                            System.out.println("                               ");
                            d[i]= new Dispositivo(nombre,modelo,material);
                        }
                }   
                }
                break;
                case 3:
                for(int i=0;i<d.length;i++) 
                {
                System.out.println(d[i].getnombre()+"  "+d[i].getmodelo()+"  "+d[i].getmeterial()+"  ");
                 }
                break;
                default:
}
}while(opcion != 4);
    
}

}
    

