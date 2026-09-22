package estudo.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import estudo.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divisionTwoNumbers(20,2);
        System.out.println(result);
        System.out.println("---------------------");
        calculadora.imprimirDivisionTwoNumber(86,0);
    }
}
