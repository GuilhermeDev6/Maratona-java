package estudo.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salary = 6000;
        String msgDonate = "Eu vou doar 500 pro DevDojo";
        String msgNotDonante = "Ainda não tenho condições, mas vou ter";
        //(condicao) ? verdadeiro : falso
        //usando operador ternario
        String result = salary > 5000 ? msgDonate : msgNotDonante;
        //usando if e else
        //String result;
        /*if (salary > 5000) {
            result = msgDonate;
        } else {
            result = msgNotDonante;*/

        System.out.println(result);
    }
}
