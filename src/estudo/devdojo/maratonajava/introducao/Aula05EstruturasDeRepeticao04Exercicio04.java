package estudo.devdojo.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao04Exercicio04 {
    public static void main(String[] args) {
        //Dado ao valor de um carro , descubra em quatas ele pode ser parcelado
        //Condiçao valorParcela >=1000
        double valorCar = 30000;
        for (int parcela = 1; parcela <= valorCar; parcela++) {
            double valorParcela = valorCar / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}