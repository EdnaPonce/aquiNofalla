package EjerciciosPOE.Practica02b_RODRIGUEZPONCEEDNAJARETIZO;

public class Medicina_alternativa extends Medicina {
    public Medicina_alternativa(String enfermedades, String tratamiento, String sintomas) {
        super(enfermedades, tratamiento, sintomas);
    }
    private String acupuntura;
    private String hipnosis;
    private String quiropractica;
    public Medicina Medicina_alternativa;
    
    //contructor 
    public Medicina_alternativa(String enfermedades, String tratamiento, String sintomas, String acupuntura, String hipnosis, String quiropractica){
        super(enfermedades, tratamiento, sintomas);
        this.acupuntura=acupuntura;
        this.hipnosis=hipnosis;
        this.quiropractica=quiropractica;
    }
   
    public Medicina_alternativa() {
    }

    //////////////////////////
    public void setAcupuntura(String ac)
    {
        acupuntura=ac;
    }
    public String getAcupuntura(){
        return acupuntura;
    }
    //////////////////////////////
    public void setHipnosis(String hip)
    {
        hipnosis=hip;
    }
    public String getHipnosis(){
        return hipnosis;
    }
    ////////////////////////
    public void setQuiropractica(String quir)
    {
        quiropractica=quir;
    }
    public String getQuiropractica(){
        return quiropractica;
    }
}
