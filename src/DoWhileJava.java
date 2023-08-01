import java.util.Random;

public class DoWhileJava {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            System.out.println("TOCANDO!");
            
        } while (Tocando());
        System.out.println("Alou !!");

    }

    private static boolean Tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu ? "+ atendeu);
        return ! atendeu;
    }
}
