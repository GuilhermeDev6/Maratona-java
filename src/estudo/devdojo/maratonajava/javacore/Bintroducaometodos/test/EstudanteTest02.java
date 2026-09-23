package estudo.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import estudo.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.name ="Jiraya";
        estudante01.age =78;
        estudante01.gender ='M';

        estudante02.name ="Sakura";
        estudante02.age =16;
        estudante02.gender ='F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
