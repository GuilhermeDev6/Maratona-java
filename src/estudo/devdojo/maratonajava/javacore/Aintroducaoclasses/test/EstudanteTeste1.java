package estudo.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import estudo.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste1 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.age = 10;
        estudante.name = "Gohan";
        estudante.gender = 'M';
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
    }
}
