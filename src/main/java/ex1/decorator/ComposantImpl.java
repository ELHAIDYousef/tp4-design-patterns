package ex1.decorator;

public class ComposantImpl implements Composant {

    @Override
    public void traitement() {
        System.out.println("    >> Traitement du composant (calcul...)");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}