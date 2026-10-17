package ex2;

import ex2.framework.Compression;
import ex2.framework.Filtre;
import ex2.framework.ImageFramework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ImageFramework framework = new ImageFramework();
        int[] image = {10, 10, 10, 200, 200, 90, 90, 90, 255, 0};
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Image : " + Arrays.toString(image));
            System.out.println("Choisir le filtre       ==> 1");
            System.out.println("Choisir la compression  ==> 2");
            System.out.println("Appliquer le filtre     ==> 3");
            System.out.println("Compresser l'image      ==> 4");
            System.out.println("Quitter                 ==> -1");
            System.out.print("Votre choix : ");
            int choix = sc.nextInt();
            sc.nextLine();

            try {
                switch (choix) {
                    case 1 -> {
                        System.out.print("Classe du filtre : ");
                        framework.setFiltre((Filtre) creer(sc.nextLine().trim()));
                        System.out.println("Filtre change.");
                    }
                    case 2 -> {
                        System.out.print("Classe de compression : ");
                        framework.setCompression((Compression) creer(sc.nextLine().trim()));
                        System.out.println("Compression changee.");
                    }
                    case 3 -> {
                        image = framework.filter(image);
                        System.out.println("Image filtree : " + Arrays.toString(image));
                    }
                    case 4 -> System.out.println("Image compressee : "
                            + Arrays.toString(framework.compresser(image)));
                    case -1 -> {
                        System.out.println("Au revoir !");
                        return;
                    }
                    default -> System.out.println("Choix invalide.");
                }
            } catch (ReflectiveOperationException | ClassCastException | IllegalStateException e) {
                System.out.println("Erreur : " + e);
            }
        }
    }

    private static Object creer(String nomClasse) throws ReflectiveOperationException {
        return Class.forName(nomClasse).getConstructor().newInstance();
    }
}