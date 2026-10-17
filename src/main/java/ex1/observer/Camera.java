package ex1.observer;

public class Camera implements Observer {

    @Override
    public void update(Observable o) {
        if (o instanceof Joueur joueur) {
            System.out.println("[Camera]  Zoom sur le joueur, nouveau score : " + joueur.getScore());
        }
    }
}