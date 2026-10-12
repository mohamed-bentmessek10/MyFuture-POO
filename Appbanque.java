import java.util.Scanner;

public class Appbanque {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String matiere;
        String nom;
        String prenom;

        System.out.print("Entrez la Nom : ");
        nom = scanner.nextLine();
        System.out.print("Entrez le Prenom : ");
        prenom = scanner.nextLine();
        System.out.print("Entrez la matiere: ");
        matiere = scanner.nextLine();

        int choix;

        do {
            System.out.println("\n--- Donnees etudiant ---");
            System.out.println("1. Consulter info");

            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("etudiant : " + nom + " " + prenom + " (matiere : " + matiere + ")");
                    scanner.close();
            }

        } while (choix != 1);
    }
}
