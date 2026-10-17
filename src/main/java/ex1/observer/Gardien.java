package ex1.observer;

public class Gardien implements Observer {

    @Override
    public void update(Observable o) {
        if (o instanceof Joueur joueur) {
            if (joueur.getScore() >= 100) {
                System.out.println("[Gardien] Alerte ! Le joueur est trop fort, je l'attaque");
            } else {
                System.out.println("[Gardien] Je continue ma patrouille");
            }
        }
    }
}