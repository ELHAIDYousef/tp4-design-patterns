package ex1.composite;

public abstract class Figure {

    protected int x;
    protected int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void dessiner();

    public abstract double surface();
}