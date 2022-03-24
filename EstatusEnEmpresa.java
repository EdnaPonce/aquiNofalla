public class EstatusEnEmpresa extends Empresa {
    String lelile;
    public EstatusEnEmpresa (String nom, int ed, String le){
        super(nom,ed);
        this.lelile=le;
}
    @Override
    public void verDatos(){
        System.out.println("*******ESTATUS EN LA EMPRESA*********");
        System.out.println("Nombre: "+ nombre+"\nEdad: " + edad + "\nEstatus: "+lelile);
    }
}
