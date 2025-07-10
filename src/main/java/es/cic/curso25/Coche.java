package es.cic.curso25;

public class Coche {

    // Variables
    public final double CONSUMO_INSTANTANEO = 4.3;
    private int velocidad = 0  ;  

    public int getVelocidad(){

        return this.velocidad;
        
    }

    public double getConsumo(){
        return ((double)velocidad) / 100.0 * CONSUMO_INSTANTANEO;

    }

    public int acelerar(int incrementoDeVelocidad){

        this.velocidad += incrementoDeVelocidad;
        return this.velocidad;
        
    }

    public int frenar(int decrementoDeVelocidad){

        this.velocidad -= decrementoDeVelocidad;
        return this.velocidad;

    }

}
