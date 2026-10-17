package ex1.decorator;

public abstract class Decorateur implements Composant {

    protected Composant composant;

    public Decorateur(Composant composant) {
        this.composant = composant;
    }

    @Override
    public void traitement() {
        composant.traitement();
    }
}