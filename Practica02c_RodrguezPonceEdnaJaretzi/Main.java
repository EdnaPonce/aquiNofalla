package Practica02c_RodrguezPonceEdnaJaretzi;
import java.util.*; 

public class Main{

public static void main(String[] args) {
    int x;
    Perro p=new Perro();
    Ave a=new Ave ();


    Scanner entrada=new Scanner(System.in);

        do {
            System.out.println("1.-Introducir datos:"); 
            System.out.println("2.-Editar");
            System.out.println("3.-Imprimir");
            x=entrada.nextInt();
            switch (x) {
                case 1:
    p.comer();
    p.moverse();
    p.correr();
    p.jugando();
    a.comer();
    a.moverse();
    a.correr();
    a.jugando();
    break;
        case 2:
        a.comer();
        a.moverse();
        a.correr();
        a.jugando();
        p.comer();
    p.moverse();
    p.correr();
    p.jugando();
        break;
        case 3:
    p.comer();
    p.moverse();
    p.correr();
    p.jugando();
    a.comer();
    a.moverse();
    a.correr();
    a.jugando();
        break;
        default:
        break;
        }
    }while(!"4".equals(x));

}
}
