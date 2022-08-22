package Tercero.Practica01b_RodriguezPonceEdnaJaretzi;

public class tren extends transporte
{
    //atributo propio 
    private String modelo;
    private String año;
    private String material;


    public void setModelo(String mod){
        modelo=mod;

    }
    public String getModelo(){
        return modelo;
    }

    public void setAño(String añ){
        año=añ;

    }
    public String getAño(){
        return año;
    }

    public void setMaterial(String mat){
        material=mat;

    }
    public String getMaterial(){
        return material;
    }

    
}
