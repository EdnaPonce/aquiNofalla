package EjerciciosPOE.Practica02b_RODRIGUEZPONCEEDNAJARETIZO;

public class Medicina {
    private String enfermedades;
    private String tratamiento;
    private String sintomas;

    //constructor
    public Medicina(){
        enfermedades="";
        tratamiento="";
        sintomas="";
    }
    public Medicina(String enfermedades, String tratamiento, String sintomas){
        this.enfermedades=enfermedades;
        this.tratamiento=tratamiento;
        this.sintomas=sintomas;
    }
    //metodos
    ///////////
    public String getEnfermedades() {
        return enfermedades;
    }
    public void setEnfermedades(String e)
    {
        this.enfermedades =e;
    }
   
    /////////////////
    public String getTratamiento() {
        return tratamiento;
    }
    public void setTratamiento(String t)
    {
        this.tratamiento =t;
    }

    ///////////////////
    public String getSintomas() {
        return sintomas;
    }
    public void setSintomas(String s)
    {
        this.sintomas =s;
    }


}
