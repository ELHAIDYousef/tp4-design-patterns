package ex1.observer;

public class Couloir implements Observer {

    @Override
    public void update(Observable o) {
        if (o instanceof Joueur joueur) {
            if (joueur.getScore() >= 100) {
                System.out.println("[Couloir] Score " + joueur.getScore() + " : la porte secrete s'ouvre");
            } else {
                System.out.println("[Couloir] Score " + joueur.getScore() + " : la porte reste fermee");
            }
        }
    }
}