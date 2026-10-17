package ex1.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Plugin plugin = new Plugin();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Strategie 1 (CSV + fichier) ==> 1");
            System.out.println("Strategie 2 (JSON + e-mail) ==> 2");
            System.out.println("Quitter                     ==> -1");
            System.out.print("Votre choix : ");
            int n = sc.nextInt();

            if (n == -1) {
                System.out.println("Au revoir !");
                return;
            }
            if (n < 1 || n > 2) {
                System.out.println("Choix invalide.");
                continue;
            }

            Strategie s = (Strategie) Class.forName("ex1.strategy.StrategieImpl" + n)
                    .getConstructor()
                    .newInstance();

            plugin.setStrategie(s);
            plugin.traitement();
        }
    }
}