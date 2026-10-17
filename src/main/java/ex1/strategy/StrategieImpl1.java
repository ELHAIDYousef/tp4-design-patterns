package ex1.strategy;

public class StrategieImpl1 implements Strategie {

    @Override
    public void partie1() {
        System.out.println("  [Impl1] partie1 : formater les donnees en CSV");
    }

    @Override
    public void partie2() {
        System.out.println("  [Impl1] partie2 : enregistrer dans un fichier");
    }
}
