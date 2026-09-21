package estudo.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import estudo.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.SumTwoNumbers();
        calculadora.minusTwoNumbers();
        System.out.println("FInalizando CalculadoraTest01");
    }
}
