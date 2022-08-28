package EjerciciosPOE.Practica02a_RODRIGUEZPONCEEDNAJARETZI;



public class Dispositivo {
     
    private String nombre;
    private String modelo;
    private String material;

    public Dispositivo(){
        nombre="";
        modelo="";
        material="";
    }

    public Dispositivo(String nom, String mod, String mate){
        nombre=nom;
        modelo=mod;
        material=mate;

    }
/////////////////////////////////////
    public void setnombre(String n)
    {
        this.nombre =n;
    }
    public String getnombre() {
        return nombre;
    }
//////////////////////////////////////
public void setmodelo(String m)
    {
        this.modelo =m;
    }
    public String getmodelo() {
        return modelo;
    }
//////////////////////////////////////
public void setmaterial(String mat)
    {
        this.material =mat;
    }
    public String getmeterial() {
        return material;
    }

    

    
}
