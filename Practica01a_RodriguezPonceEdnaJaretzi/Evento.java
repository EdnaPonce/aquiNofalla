package Practica01a_RodriguezPonceEdnaJaretzi;

public class Evento {
    
    String fecha,lugar, hora;
    int capacidad;
    double costoBoleto;
   


    public Evento(String fechaPersona, String lugarPersona, String horaPersona, int capacidadPersona, double costoBoleto) {
    }
    public void setFecha(String pFecha) {
        this.fecha = pFecha;
    }
    public void setLugar(String pLugar) {
        this.lugar = pLugar;
    }
    public void setHora(String edadHora) {
        this.hora = edadHora;
    }
    public void setCapacidad(int pCapacidad) {
        this.capacidad = pCapacidad;
    }
    public void setCostoBoleto(double pCostoBoleto) {
        this.costoBoleto = pCostoBoleto;
    }

    
    
    
    public String getFecha() {
        return fecha;
    }
    public String getLugar() {
        return lugar;
    }
    public String getHora() {
        return hora;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public double getCostoBoleto() {
        return costoBoleto;
    }
}
