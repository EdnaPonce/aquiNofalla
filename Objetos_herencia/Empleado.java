//Subclase
public class Empleado extends Empresa{
    double sueldo;
    String telefono, direccion;
    public Empleado (String nom, int ed, double suel, String tel, String dir){
        super(nom,ed);
        this.direccion=dir;
        this.sueldo=suel;
        this.telefono=tel;
    }
    @Override
    public void verDatos(){
        System.out.println("*******DATOS DEL EMPLEADO***********");
        System.out.println("Nombre: "+ nombre+"\nEdad: " + edad + "\nSueldo: "+sueldo+"\nTelefono: "+ telefono +"\nDireccion: "+direccion);

    }
}
