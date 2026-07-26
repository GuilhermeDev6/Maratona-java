package estudo.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //Dado ao valor de um carro , descubra em quatas ele pode ser parcelado
        //Condiçao valorParcela >=1000
        double valorCar = 30000;
        for (int parcela = (int)valorCar; parcela >= 1; parcela--) {
            double valorParcela = valorCar / parcela;
            if (valorParcela<1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}

