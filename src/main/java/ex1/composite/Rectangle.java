package ex1.composite;

public class Rectangle extends Figure {

    private double largeur;
    private double hauteur;

    public Rectangle(int x, int y, double largeur, double hauteur) {
        super(x, y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void dessiner() {
        System.out.println("Rectangle (" + x + ", " + y + ") " + largeur + " x " + hauteur);
    }

    @Override
    public double surface() {
        return largeur * hauteur;
    }
}