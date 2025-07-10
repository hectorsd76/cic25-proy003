package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

// import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        
        // Preparo
        Calculadora cut = new Calculadora();


        // Ejecuto
        cut.sumar(5.6);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(5.6, valorActual, 0.000001);


        cut.sumar(3.4);
        valorActual = cut.getTotal();

        assertEquals(9, valorActual, 0.000001);
    }

    @Test
    public void testRestar() {

        // Preparo
        Calculadora cut = new Calculadora();


        // Ejecuto
        cut.restar(5.6);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(-5.6, valorActual);
    }

    @Test
    public void testMultiplcar() {

        // Preparo
        Calculadora cut = new Calculadora();


        // Ejecuto
        cut.multiplicar(5.6);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(0, valorActual);
    }

    @Test
    public void testDividir() {

        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(2);

        // Ejecuto
        cut.dividir(2);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(1, valorActual);
    }

    // @Disabled
    @Test
    public void testDividirPorCero() {

        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(2);

        // Ejecuto
        assertThrowsExactly(ArithmeticException.class,() -> cut.dividir(0));
  
    }

    @Test
    void testLimpiar() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(2);

        //Ejcutar
        cut.limpiar();

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(0, valorActual);

    }
    
}
