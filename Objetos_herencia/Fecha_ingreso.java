public class Fecha_ingreso extends Empresa {
    String Fecha;
    public Fecha_ingreso (String nom, int ed, String fe){
        super(nom,ed);
        this.Fecha=fe;
}
    @Override
    public void verDatos(){
        System.out.println("*******DATOS DE INGRESO*********");
        System.out.println("Nombre: "+ nombre+"\nEdad: " + edad + "\nFecha Ingreso: "+Fecha);
    }
}