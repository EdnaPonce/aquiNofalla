
package Practica01b_RodriguezPonceEdnaJaretzi;
import java.util.*; 
public class principalb {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int x;
        tren t1=new tren();
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println("1.-Introducir datos:"); 
            System.out.println("2.-Editar");
            System.out.println("3.-Imprimir");
            x=entrada.nextInt();
            switch (x) {
                case 1:
        
        t1.setModelo("MK334");
        t1.setVelocidad(40.5);
        t1.setNombre("TRENBALA");
        t1.setColor("negro");
        t1.setAño("2004");
        t1.setMaterial("Metal");
        t1.mostrarMensaje();
        System.out.println("Modelo:"+t1.getModelo()+"velocidad:"+t1.getVelocidad()+"Nombre:"+t1.getNombre()+"Maretial:"+t1.getMaterial()+"Año:"+t1.getAño());
        break;
        case 2:
        t1.setModelo("B658");
        t1.setVelocidad(110.5);
        t1.setNombre("TREN EDNA ");
        t1.setColor("ROJO ");
        t1.setAño("2018 ");
        t1.setMaterial("titanio ");
        t1.mostrarMensaje();
        System.out.println("Modelo:"+t1.getModelo()+"velocidad:"+t1.getVelocidad()+"Nombre:"+t1.getNombre()+"Maretial:"+t1.getMaterial()+"Año:"+t1.getAño());        
        break;
        case 3:
        t1.setModelo("MK334");
        t1.setVelocidad(40.5);
        t1.setNombre("TRENBALA");
        t1.setColor("negro");
        t1.setAño("2004");
        t1.setMaterial("Metal");
        t1.mostrarMensaje();
        System.out.println("Modelo:"+t1.getModelo()+"velocidad:"+t1.getVelocidad()+"Nombre:"+t1.getNombre()+"Maretial:"+t1.getMaterial()+"Año:"+t1.getAño());
        break;
        default:
        break;
        }
    }while(!"4".equals(x));
}

}

        
    
