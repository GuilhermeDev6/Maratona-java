package estudo.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void SumTwoNumbers(){
        System.out.println(10+10);
    }

    public void minusTwoNumbers(){
        System.out.println(10-5);
    }

    public void timesTwoNumbers(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divisionTwoNumbers(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public void imprimirDivisionTwoNumber (double num1, double num2){
        if (num2 == 0){
            System.out.println("Nao existe divisao por zero");
            return;
        }
        System.out.println(num1/num2);
    }

}
