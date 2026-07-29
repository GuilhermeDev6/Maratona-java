package estudo.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] number = new int[3];
        int[] number2 = {1, 2, 3, 4, 5}; //realizar a inicializaçao do array já com valores declarados
        int[] number3 = new int[]{1, 2, 3, 4, 5};

        /*for (int i = 0; i <number3.length ; i++) {
            System.out.println(number3[i]);
        }*/
        for (int num : number3) {
            System.out.println(num);
        }
    }
}
