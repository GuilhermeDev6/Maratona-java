package estudo.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02Exercicio03 {
    public static void main(String[] args) {
       /* //Imprima todos os numeros pares de 0 até 1000
        int par = 0;
        while (par <= 1000) {
            System.out.println(par += 2);
        }*/

        //Da maneira abaixo mesmo se o numero inicial alterar ainda irá retornar um numero par
        int par = 0;
        par = 0;
        while (par <= 1000) {
            if (par % 2 == 0) {
                System.out.println(par += 2);
            }
        }

        /*par = 0;
        do {
            System.out.println(par += 2);

        } while (par <= 1000);*/

        /*for (int i = 0; i <= 1000; i += 2) {
            System.out.println("For " + i);

        }*/
    }
}
