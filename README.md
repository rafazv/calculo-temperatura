# Calculo Temperatura
## Trabalho para matéria Gerência de Configuração

Calculo Temperatura é um programa em Java que realiza conversões de temperaturas em Celsius para Fahrenheint e vice-versa.

## Como executar o programa

- Clone o repositório
- Execute no terminal o seguinte comando 
    ```sh
    javac ConversorTemp.java
    ```
- Em seguida execute, e siga as instruções que o programa apresenta
    ```sh
    java ConversorTemp
    ```


## Para executar os testes

- São necessários os arquivos "hamcrest-core-1.3.jar" e "junit-4.13.2.jar". Eles são responsáveis por rodar o JUnit pelo console. Obs.: Esses arquivos já vêm quando o repositório é clonado.
- Execute no terminal o seguinte comando 
    ```sh
    javac -cp junit-4.13.2.jar:. ConversorTempTeste.java
    ```
- Em seguida execute e siga as instruções que o programa apresenta
    ```sh
    java -cp junit-4.13.2.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore ConversorTempTeste
    ```
- Obs. 1: Caso esteja usando Windows, troque ':' por ';'. Exemplo:
    ```sh
    javac -cp junit-4.13.2.jar;. ConversorTempTeste.java
    ```
    ```sh
    java -cp junit-4.13.2.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore ConversorTempTeste
    ```
- Obs. 2: Caso o programa não tenha sido compilado antes de executar os testes, é necessário compilá-lo primeiro através do comando:
    ```sh
    javac ConversorTemp.java
    ```