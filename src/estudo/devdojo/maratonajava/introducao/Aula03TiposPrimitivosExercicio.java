package estudo.devdojo.maratonajava.introducao;
import java.time.LocalDate;
/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
*/



public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String Name = "Guilherme";
        String Address = "Rua torta Casa torta N67";
        //String Payday = "01/01/2001";
        LocalDate Payday = LocalDate.of(2001, 1, 1);
        double salary = 4458.67;
        String Paycheck = "Eu "+Name+", morando no endereço: "+Address+", confirmo que recebi o salário de "+salary+", na data "+Payday;
        //System.out.println("Eu "+Name+", morando no endereço: "+Address+", confirmo que recebi o salário de "+salary+", na data "+Payday);
        System.out.println(Paycheck);
    }
}
