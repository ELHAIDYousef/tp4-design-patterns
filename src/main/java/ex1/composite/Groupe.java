package ex1.composite;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Figure {

    private final List<Figure> figures = new ArrayList<>();

    public Groupe(int x, int y) {
        super(x, y);
    }

    public void ajouter(Figure f) {
        figures.add(f);
    }

    public void supprimer(Figure f) {
        figures.remove(f);
    }

    @Override
    public void dessiner() {
        System.out.println("Groupe (" + x + ", " + y + ") debut");
        for (Figure f : figures) {
            f.dessiner();
        }
        System.out.println("Groupe (" + x + ", " + y + ") fin");
    }

    @Override
    public double surface() {
        double total = 0;
        for (Figure f : figures) {
            total += f.surface();
        }
        return total;
    }
}