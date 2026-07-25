package estudo.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06Exercicio02 {
    public static void main(String[] args) {
        // Utilizando Switch
        // Dados os valores de 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo

        byte day = 7;
        String weekend = "Hoje é fim de semana";
        String weekday = "Hoje é dia útil";
        switch (day) {
            case 1:
            case 7:
                System.out.println(weekend);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(weekday);
                break;
            default:
                System.out.println("Opçao invalida");
        }
    }
}
