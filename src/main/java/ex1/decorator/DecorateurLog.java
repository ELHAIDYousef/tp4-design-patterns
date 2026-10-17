package ex1.decorator;

public class DecorateurLog extends Decorateur {

    public DecorateurLog(Composant composant) {
        super(composant);
    }

    private void avant() {
        System.out.println("[LOG] Debut du traitement");
    }

    private void apres() {
        System.out.println("[LOG] Fin du traitement");
    }

    @Override
    public void traitement() {
        avant();
        super.traitement();
        apres();
    }
}