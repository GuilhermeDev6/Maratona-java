package estudo.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 10;
        boolean isAutorizadoComprarBebida = age >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else {
            System.out.println("Não utorizado a comprar bebida alcólica");
        }

        // ! operador de negaacao isAutorizadoComprarBebida == false
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não utorizado a comprar bebida alcólica");
        }
        boolean c = true;
        if (c = false) {
            System.out.println("Dentro de algo que nunca deve ser feito ");
        }
        System.out.println("Fora do if");
    }
}
