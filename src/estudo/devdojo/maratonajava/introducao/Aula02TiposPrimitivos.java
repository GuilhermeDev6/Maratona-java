package estudo.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
     public static void main(String[] args) {
        //int, double, float, chat, byte, short, long, boolean
        int age = (int)100000000000L; //casting
        long number = 100000;
        double salaryDouble = 2600;
        float salaryFloat = 3000;
        byte ageByte = 10;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 'M';

        String name = "Guilherme";
        //var nome2 = "Vegeta"; essa funcionalidade foi adicionada no java 10, porém o level do projeto está no java 8
        System.out.println("A idade é: "+age+" anos");
        System.out.println(verdadeiro);
        System.out.println("Oi meu nome é "+name);
    }
}
