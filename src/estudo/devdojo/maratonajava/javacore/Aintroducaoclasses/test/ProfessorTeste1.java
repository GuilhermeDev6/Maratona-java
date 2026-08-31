package estudo.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import estudo.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste1 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Professor Girafales";
        professor.age = 33;
        professor.gender = 'M';

        System.out.println("O meu professor é o: " + professor.name + " ele tem " + professor.age + " anos e é do sexo " + professor.gender);

    }
}
