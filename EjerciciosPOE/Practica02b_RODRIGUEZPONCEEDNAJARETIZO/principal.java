package EjerciciosPOE.Practica02b_RODRIGUEZPONCEEDNAJARETIZO;
import java.util.Scanner;

public class principal {
    private static int a;
    private static int b;
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int opcion = 4;
        String enfermedades="";
        String tratamiento="";
        String sintomas="";
        String acupuntura="";
        String hipnosis="";
        String quiropractica="";
        

        Medicina m2=new Medicina();
        Medicina_alternativa m1=new Medicina_alternativa();
        do{
            System.out.println("\n\t1. La opcion de registrar");
            System.out.println("\n\t2. La opcion de buscar, editar o eliminar");
            System.out.println("\n\t3. La opcion de imprimir");
            System.out.println("\n\t4. salir de la aplicacion");
            opcion = leer.nextInt();
            System.out.println("\n\t");

            switch(opcion)
            {
            case 1:
            enfermedades=leer.nextLine();
            System.out.println("Ingresa nombre del la enfermedad :");
            enfermedades=leer.nextLine();
            m2.setEnfermedades(enfermedades);
            System.out.println("Ingresa nombre del tratamiento :");
            tratamiento=leer.nextLine();
            m2.setTratamiento(tratamiento);
            System.out.println("Ingresa los sintomas:");
            sintomas=leer.nextLine();
            m2.setSintomas(sintomas);
            System.out.println("Como se trata con acupuntura :");
            acupuntura=leer.nextLine();
            m1.setAcupuntura(acupuntura);
            System.out.println("Como se trata con hipnosis:");
            hipnosis=leer.nextLine();
            m1.setHipnosis(hipnosis);
            System.out.println("Como se trata con quiropractica:");
            quiropractica=leer.nextLine();
            m1.setQuiropractica(quiropractica);
            break;   
            case 2:
            System.out.println("1.-Buscar por enfermedad");
                System.out.println("2.-Buscar por tratamiento");
                System.out.println("3.-Buscar por Sintomas");
                System.out.println("4.-Buscar por metodo de acupuntura");
                System.out.println("5.-Buscar por meto de hipnosis");
                System.out.println("6.-Buscar por metodo de quiropractica");
                a = leer.nextInt();
                if (a == 1){     
                    System.out.println("La enfermedad es:"+m2.getEnfermedades());
                    System.out.println("Desea modificarlos Y-->1/No--->Enter");
                     b = leer.nextInt();
                     if(b==1){
                            enfermedades=leer.nextLine();
                            System.out.println("                               ");
                            System.out.println("Ingresa nueva enfermedad:");
                            enfermedades=leer.nextLine();
                            System.out.println("                               ");
                            m2.setEnfermedades(enfermedades);
                    }
                  
                }else if (a == 2){     
                    System.out.println("El tratamiento es:"+m2.getTratamiento());
                    System.out.println("Desea modificarlos Y-->1/No--->Enter");
                     b = leer.nextInt();
                     if(b==1){
                            tratamiento=leer.nextLine();
                            System.out.println("                               ");
                            System.out.println("Ingresa nuevo tratamiento:");
                            tratamiento=leer.nextLine();
                            System.out.println("                               ");
                            m2.setTratamiento(tratamiento);
                    }
                  
                }else if (a == 3){     
                    System.out.println("Los sintomas son: "+m2.getSintomas());
                    System.out.println("Desea modificarlos Y-->1/No--->Enter");
                     b = leer.nextInt();
                     if(b==1){
                            sintomas=leer.nextLine();
                            System.out.println("                               ");
                            System.out.println("Ingrese los nuevos sintomas:");
                            sintomas=leer.nextLine();
                            System.out.println("                               ");
                            m2.setSintomas(sintomas);
                    } 
                }else if (a == 4){     
                    System.out.println("El metodo de acupulura es "+m1.getAcupuntura());
                    System.out.println("Desea modificarlos Y-->1/No--->Enter");
                     b = leer.nextInt();
                     if(b==1){
                            acupuntura=leer.nextLine();
                            System.out.println("                               ");
                            System.out.println("Ingrese el nuevo metodo de acupuntura:");
                            acupuntura=leer.nextLine();
                            System.out.println("                               ");
                            m1.setAcupuntura(acupuntura);
                    }
                }else if (a == 5){     
                    System.out.println("El metodo de hipnosis es "+m1.getHipnosis());
                    System.out.println("Desea modificarlos Y-->1/No--->Enter");
                     b = leer.nextInt();
                     if(b==1){
                            hipnosis=leer.nextLine();
                            System.out.println("                               ");
                            System.out.println("Ingrese el nuevo metodo de hipnosis:");
                            hipnosis=leer.nextLine();
                            System.out.println("                               ");
                            m1.setHipnosis(hipnosis);
                    }
                }else if (a == 6){     
                    System.out.println("El metodo de quiropractica es "+m1.getQuiropractica());
                    System.out.println("Desea modificarlos Y-->1/No--->Enter");
                     b = leer.nextInt();
                     if(b==1){
                            quiropractica=leer.nextLine();
                            System.out.println("                               ");
                            System.out.println("Ingrese nuevo metodo de quiropractica:");
                            quiropractica=leer.nextLine();
                            System.out.println("                               ");
                            m1.setQuiropractica(quiropractica);
                    }
                }else{
                    System.out.println("Lo sentimos esta opcion no se encontro :(");
                }
            break;
            case 3:
            System.out.println("La enfermedad es:"+m2.getEnfermedades());
            System.out.println("El tratamiento es:"+m2.getTratamiento());
            System.out.println("Los sintomas son:"+m2.getSintomas());
            
            System.out.println("La forma de tratar con acupuntura es:"+m1.getAcupuntura());
            System.out.println("La forma de tratar con Hipnosis es:"+m1.getHipnosis());
            System.out.println("La forma de tratar con quiropractica es:"+m1.getQuiropractica());
            break;
            default:
    }
}while(opcion != 4);
}
}
