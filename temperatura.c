#include <stdio.h>

float celsiusFahrenheit(float c) {
  float f;
  f = (c*9/5)+32;
  return f;
}

float fahrenheitCelsius(float f) {
  float c;
  c = (f-32)*5/9;
  return c;
}

int main(void)
{
  int controle = -1;
  float f, c;

  while(controle != 0) {
    printf("CALCULADORA TEMPERATURA\n\n");
    printf("Digite 1 para calcular a temperatura de Celsius para Fahrenheint\n");
    printf("Digite 2 para calcular a temperatura de Fahrenheint para Celsius\n");
    printf("Digite 0 para sair\n");

    scanf("%d", &controle);
    switch (controle) {
      case 1: 
        printf("Digite a temperatura (C): ");
        scanf("%f", &c);
        printf("\nTemperatura em Fahrenheint: ");
        printf("%.2f F\n\n", celsiusFahrenheit(c));
        break;
      case 2:
        printf("Digite a temperatura (F): ");
        scanf("%f", &f);
        printf("\nTemperatura em Celsius: ");
        printf("%.2f C\n\n", fahrenheitCelsius(f));
        break;
      case 0:
        break;
      default:
        printf("Digite um valor válido!\n\n");
        break;
    }
  }

  return 0;
}