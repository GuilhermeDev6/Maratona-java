package estudo.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        int result = number02 + number01;
        //System.out.println(number02+number01);
        System.out.println(result);

        //% RESTO
        int resto = 20 % 2;
        System.out.println(resto);

        /*relational operators         < > <= >= == !=
         */
        boolean isDezMariorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMariorQueVinte " + isDezMariorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        //logical operators && (AND) || (or) !
        int age = 29;
        float salary = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age >= 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salary >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double accountSalaryBalance = 200;
        double accountSavingsBalance = 10000;
        float pricePlastation = 5000F;
        boolean isPlaystationFivePurchasable = accountSalaryBalance > pricePlastation || accountSavingsBalance > pricePlastation;
        System.out.println("isPlaystationFivePurchasable " + isPlaystationFivePurchasable);

        //Operadores de atribuição = += -= *= /= %=

        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        //++ --
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(contador2++);// Primeiro executa oque tem que ser executado dentro da linha
        System.out.println(contador2);// Depois incrimenta oque tem que ser incrementado



    }
}
