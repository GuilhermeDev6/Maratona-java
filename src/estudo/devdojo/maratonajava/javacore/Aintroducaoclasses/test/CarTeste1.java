package estudo.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import estudo.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Car;

public class CarTeste1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Vitiligo";
        car.model = "Subaru Impreza";
        car.year = 1990;

        Car car2 = new Car();
        car2.name = "Charula";
        car2.model = "Caravan";
        car2.year = 1978;

        System.out.println("Era uma vez dois amigos, apaixonados por carros, Ricardinho ACF com o seu conhecido " + car.name + " do modelo " + car.model + " ano " + car.year);
        System.out.println("E conhecido Alemão da Caravan, que era apaixonado na sua " + car2.name + " do modelo " + car2.model + " ano " + car2.year);
    }
}
