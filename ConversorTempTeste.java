import static org.junit.Assert.*;
import org.junit.Test;

public class ConversorTempTeste {

    @Test
    public void testeFahrenheitCelsius(){
        ConversorTemp conversor = new ConversorTemp();
        double respMetodo, temp;

        System.out.println("\nFahrenheint to Celsius - TEST #1");
        temp = 32;
        System.out.println("Fahrenheint temperature: " + temp);
        respMetodo = conversor.fahrenheitCelsius(temp);
        System.out.println("Celsius temperature: " + respMetodo);
        assertEquals(0.0, respMetodo, 0.0002);

        System.out.println("\nFahrenheint to Celsius - TEST #2");
        temp = 84;
        System.out.println("Fahrenheint temperature: " + temp);
        respMetodo = conversor.fahrenheitCelsius(temp);
        System.out.println("Celsius temperature: " + respMetodo);
        assertEquals(28.88889, respMetodo, 0.0002);
    }

    @Test
    public void testeCelsiusFahrenheit(){
        ConversorTemp conversor = new ConversorTemp();
        double respMetodo, temp;

        System.out.println("\nCelsius to Fahrenheint - TEST #1");
        temp = 0;
        System.out.println("Celsius temperature: " + temp);
        respMetodo = conversor.celsiusFahrenheit(temp);
        System.out.println("Fahrenheint temperature: " + respMetodo);
        assertEquals(32.0, respMetodo, 0.0002);

        System.out.println("\nCelsius to Fahrenheint - TEST #2");
        temp = 35.9;
        System.out.println("Celsius temperature: " + temp);
        respMetodo = conversor.celsiusFahrenheit(temp);
        System.out.println("Fahrenheint temperature: " + respMetodo);
        assertEquals(96.62, respMetodo, 0.0002);
    }
}