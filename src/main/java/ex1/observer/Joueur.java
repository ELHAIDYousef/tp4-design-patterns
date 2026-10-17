package ex1.observer;

import java.util.ArrayList;
import java.util.List;

public class Joueur implements Observable {

    private final List<Observer> observers = new ArrayList<>();
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        notifierObservers();
    }

    @Override
    public void ajouterObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void supprimerObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifierObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }
}