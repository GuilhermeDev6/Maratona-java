package estudo.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long e double o valor padrao é 0
        //char `\u0000 vai imprimir um valor em branco
        //boolean o padrao é false
        //String o valor é null

        String[] names = new String[4];
        names [0] = "Goku";
        names [1] = "Vegeta";
        names [2] = "Naruto";
        names [3] = "Sasuke";

        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);
        }
    }
}
