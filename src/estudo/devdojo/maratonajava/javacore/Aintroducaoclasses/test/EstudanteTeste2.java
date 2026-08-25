package estudo.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import estudo.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Sasuke";
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
        System.out.println(estudante.name);
        System.out.println("--------------");

        Estudante estudante2 = new Estudante();
        System.out.println(estudante2.age);
        System.out.println(estudante2.gender);
        System.out.println(estudante2.name);


    }
}
