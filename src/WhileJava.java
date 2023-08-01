import java.util.concurrent.ThreadLocalRandom;

public class WhileJava {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            double valorCompra = valorAleatorio();
            if (valorCompra > mesada) {
                valorCompra = mesada;

            }
            System.out.println("Doce no valor " + valorCompra + "Adicionado ao carrinho de compra");
            mesada -= valorCompra;

        }
        System.out.println("Mesada: "+mesada);
        System.out.println("Mesada toda gasta !");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
