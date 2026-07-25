package estudo.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicio01 {
    public static void main(String[] args) {
        double salary = 70000;

        double tax1 = salary * (9.7 / 100);
        double tax2 = salary * (37.35 / 100);
        double tax3 = salary * (49.50 / 100);
        double afterTax;

        if (salary <= 34712) {
            afterTax = tax1;
        } else if (salary > 34712 && salary <= 68507) {
            afterTax = tax2;
        } else {
            afterTax = tax3;
        }
        System.out.println("Seu salario após os impostos é: " + afterTax);
    }
}
