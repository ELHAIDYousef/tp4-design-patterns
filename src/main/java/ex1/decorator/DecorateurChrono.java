package ex1.decorator;

public class DecorateurChrono extends Decorateur {

    private long debut;

    public DecorateurChrono(Composant composant) {
        super(composant);
    }

    private void avant() {
        System.out.println("  [CHRONO] Demarrage");
        debut = System.nanoTime();
    }

    private void apres() {
        long dureeMs = (System.nanoTime() - debut) / 1_000_000;
        System.out.println("  [CHRONO] Duree : " + dureeMs + " ms");
    }

    @Override
    public void traitement() {
        avant();
        super.traitement();
        apres();
    }
}