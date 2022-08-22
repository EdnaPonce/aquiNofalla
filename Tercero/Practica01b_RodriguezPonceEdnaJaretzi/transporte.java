package Tercero.Practica01b_RodriguezPonceEdnaJaretzi;


//Padre hereda 
public class transporte {
    private double velocidad;
    private String nombre;
    private String color;

    public void mostrarMensaje()
    {
        System.out.println("Soy un medio de transporte");
    }
//metodos para darles valor a cada objeto 
public void setVelocidad(double v){
    velocidad=v;
}
//metodo para que nos diga que valor hay en el atributo 
public double getVelocidad(){
    return velocidad;
}

public void setNombre(String n){
    nombre=n;
}
public String getNombre()
{
    return nombre;
}

public void setColor(String c){
    color=c;
}
public String getColor()
{
    return color;
}
    
}
