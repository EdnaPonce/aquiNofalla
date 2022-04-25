public class Seguro extends Empresa{
    double seguroNum;
    String CURP, clinica;
    public Seguro (String nom, int ed, double segn, String CP, String Cli){
        super(nom,ed);
        this.seguroNum=segn;
        this.CURP=CP;
        this.clinica=Cli;
    }
    @Override
    public void verDatos(){
        System.out.println("*******DATOS SEGURO*********");
        System.out.println("Nombre: "+ nombre+"\nEdad: " + edad + "\nNumero de seguro: "+seguroNum+"\nCURP: "+ CURP +"\nClinica: "+clinica);

    }
}
