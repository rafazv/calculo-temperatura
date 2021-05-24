import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTempTeste {

    @Test
    public void testeFahrenheitCelsius(){
        ConversorTemp conversor = new ConversorTemp();
        float respMetodo;

        respMetodo = conversor.fahrenheitCelsius(32);
        assertEquals(0.0, respMetodo);

        respMetodo = conversor.fahrenheitCelsius(84);
        assertEquals(28.88889, respMetodo);
    }

    @Test
    public void testeCelsiusFahrenheit(){
        ConversorTemp conversor = new ConversorTemp();
        float respMetodo;

        respMetodo = conversor.celsiusFahrenheit(0);
        assertEquals(32.0, respMetodo);

        respMetodo = conversor.celsiusFahrenheit(35,9);
        assertEquals(96.62, respMetodo);
    }
}