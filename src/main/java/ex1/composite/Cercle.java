package ex1.composite;

public class Cercle extends Figure {

    private double rayon;

    public Cercle(int x, int y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    @Override
    public void dessiner() {
        System.out.println("Cercle (" + x + ", " + y + ") rayon = " + rayon);
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }
}