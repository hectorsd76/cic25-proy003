package es.cic.curso25;

public class Vehiculo {
    // CONSTANTES
    public final double CONSUMO_INSTANTANEO = 4.3;
    // VARIABLES
    protected Calculadora calculadora;
    protected Camion camion;
    protected Coche coche;
    protected int velocidad = 0  ;  
    // CONSTRUCTOR 


    public Vehiculo(){
        super();
        this.calculadora = new Calculadora();
        this.coche = new Coche();
        this.camion = new Camion();
    }


    public int acelerar(int incrementoDeVelocidad){
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.sumar(incrementoDeVelocidad);

        this.velocidad = (int) Math.round(calculadora.getTotal());
        return this.velocidad;
        
    }

    public double getConsumo(){
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.dividir(100);
        this.calculadora.multiplicar(CONSUMO_INSTANTANEO);



        return  calculadora.getTotal();

    }



    public int frenar(int decrementoDeVelocidad){

        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.restar(decrementoDeVelocidad);

        this.velocidad = (int) Math.round(calculadora.getTotal());
        return this.velocidad;

    }

    public int getVelocidad(){

        return this.velocidad;
        
    }
}
