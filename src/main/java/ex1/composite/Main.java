package ex1.composite;

public class Main {
    public static void main(String[] args) {

        Figure cercle = new Cercle(0, 0, 1);
        Figure rectangle = new Rectangle(5, 5, 2, 3);

        Groupe sousGroupe = new Groupe(10, 10);
        sousGroupe.ajouter(new Cercle(10, 10, 2));
        sousGroupe.ajouter(new Rectangle(12, 12, 1, 1));

        Groupe dessin = new Groupe(0, 0);
        dessin.ajouter(cercle);
        dessin.ajouter(rectangle);
        dessin.ajouter(sousGroupe);

        dessin.dessiner();
        System.out.printf("Surface totale : %.2f%n", dessin.surface());

        dessin.supprimer(rectangle);
        System.out.printf("Surface sans le rectangle : %.2f%n", dessin.surface());
    }
}