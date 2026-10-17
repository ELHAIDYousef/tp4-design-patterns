package ex1.strategy;

public class Plugin {

    private Strategie strategie;

    public void setStrategie(Strategie strategie) {
        this.strategie = strategie;
    }

    public void traitement() {
        if (strategie == null) {
            System.out.println("Aucune strategie choisie.");
            return;
        }
        System.out.println("Etape fixe : ouvrir le plugin");
        strategie.partie1();
        System.out.println("Etape fixe : verifier le resultat");
        strategie.partie2();
        System.out.println("Etape fixe : fermer le plugin");
    }
}