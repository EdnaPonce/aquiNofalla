public class Preferencias extends Empresa {
    String Hobbit,  Comida;
    public Preferencias (String nom, int ed, String ho, String Co){
        super(nom,ed);
        this.Hobbit=ho;
        this.Comida=Co;
        
    
}
    @Override
    public void verDatos(){
        System.out.println("*******PREFERENCIAS*********");
        System.out.println("Nombre: "+ nombre+"\nEdad: " + edad + "\nHobbits: "+Hobbit+"\nComida de preferencia: "+ Comida);
    }
}