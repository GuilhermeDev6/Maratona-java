package estudo.devdojo.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //imprima os primeiro 25 numeros de dum dado valor. por exemplo 50
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
