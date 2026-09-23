package estudo.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String name;
    public int age;
    public char gender;

    public void imprime(){
        System.out.println("----------------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }

}
