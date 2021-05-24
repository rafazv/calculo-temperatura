import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTempTeste {

    @Test
    public void testeFahrenheitCelsius(){
        ConversorTemp conversor = new ConversorTemp();
        double respMetodo, temp;

        temp = 32;
        respMetodo = conversor.fahrenheitCelsius(temp);
        assertEquals(0.0, respMetodo, 0.0002);

        temp = 84;
        respMetodo = conversor.fahrenheitCelsius(temp);
        assertEquals(28.88889, respMetodo, 0.0002);
    }

    @Test
    public void testeCelsiusFahrenheit(){
        ConversorTemp conversor = new ConversorTemp();
        double respMetodo, temp;

        temp = 0;
        respMetodo = conversor.celsiusFahrenheit(temp);
        assertEquals(32.0, respMetodo, 0.0002);

        temp = 35.9;
        respMetodo = conversor.celsiusFahrenheit(temp);
        assertEquals(96.62, respMetodo, 0.0002);
    }
}