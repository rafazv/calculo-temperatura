import java.util.*;

public class ConversorTemp {
    public double fahrenheitCelsius(double f) {
        double c;
        c = (f-32)*5/9;
        return c;
    }

    public double celsiusFahrenheit(double c) {
        double f;
        f = (c*9/5)+32;
        return f;
    }

    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        ConversorTemp calc = new ConversorTemp();
        int controle = -1;
		double c, f; 

		System.out.print("CONVERSOR DE TEMPERATURA\n\n"); 
		
		while(controle != 0) {
            System.out.print("Digite 1 para calcular a temperatura de Celsius para Fahrenheint\n");
            System.out.print("Digite 2 para calcular a temperatura de Fahrenheint para Celsius\n");
            System.out.print("Digite 0 para sair\n");

            controle = entrada.nextInt();
            switch (controle) {
                case 1: 
                    System.out.print("Digite a temperatura (C): ");
                    c = entrada.nextDouble();
                    System.out.print("\nTemperatura em Fahrenheint: ");
                    System.out.print(calc.celsiusFahrenheit(c) +" F\n\n");
                    break;
                case 2:
                    System.out.print("Digite a temperatura (F): ");
                    f = entrada.nextDouble();
                    System.out.print("\nTemperatura em Celsius: ");
                    System.out.print(calc.fahrenheitCelsius(f) + " C\n\n");
                    break;
                case 0:
                    break;
                default:
                    System.out.print("Digite um valor válido!\n\n");
                    break;
                }
        }
    }
}