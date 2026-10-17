package ex1.decorator;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== 1. Composant seul =====");
        Composant c1 = new ComposantImpl();
        c1.traitement();

        System.out.println("\n===== 2. Avec le log =====");
        Composant c2 = new DecorateurLog(new ComposantImpl());
        c2.traitement();

        System.out.println("\n===== 3. Avec le chrono =====");
        Composant c3 = new DecorateurChrono(new ComposantImpl());
        c3.traitement();

        System.out.println("\n===== 4. Log + chrono (empiles) =====");
        Composant c4 = new DecorateurLog(new DecorateurChrono(new ComposantImpl()));
        c4.traitement();
    }
}