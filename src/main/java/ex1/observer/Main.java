package ex1.observer;

public class Main {
    public static void main(String[] args) {

        Joueur joueur = new Joueur();

        Observer couloir = new Couloir();
        Observer camera = new Camera();
        Observer gardien = new Gardien();

        joueur.ajouterObserver(couloir);
        joueur.ajouterObserver(camera);
        joueur.ajouterObserver(gardien);

        System.out.println("===== Score = 50 =====");
        joueur.setScore(50);

        System.out.println("\n===== Score = 120 =====");
        joueur.setScore(120);

        joueur.supprimerObserver(gardien);

        System.out.println("\n===== Gardien desabonne, score = 150 =====");
        joueur.setScore(150);
    }
}