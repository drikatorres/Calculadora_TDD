import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calculadora;
    @BeforeEach
    public void inicio () {
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomarCerto(){
        //Given
        //When
        Integer a = 10;
        Integer b = 5;
        Integer resultado = calculadora.somar(a,b);

        //Then
        Assertions.assertEquals(15, resultado);
    }

    @Test
    public void deveSubtrairCerto () {
        //Given
        //When
        Integer a = 10;
        Integer b = 5;
        Integer resultado = calculadora.substrair(a,b);

        //Then
        Assertions.assertTrue(5== resultado);
    }

    @Test
    public void deveMultiplicarCerto() {
        //Given
        //When
        Integer a = 10;
        Integer b = 5;
        Integer resultado = calculadora.multiplicar(a,b);

        //Then
        Assertions.assertEquals(50,resultado);

    }

    @Test
    public void deveDividirCerto() {
        //Given
        //When
        Integer a = 10;
        Integer b = 5;
        Integer resultado = calculadora.dividir(a,b);

        //Then
        Assertions.assertEquals(2,resultado);

    }
}
