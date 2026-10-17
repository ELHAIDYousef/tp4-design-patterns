package ex1.strategy;

public class StrategieImpl2 implements Strategie {

    @Override
    public void partie1() {
        System.out.println("  [Impl2] partie1 : formater les donnees en JSON");
    }

    @Override
    public void partie2() {
        System.out.println("  [Impl2] partie2 : envoyer par e-mail");
    }
}