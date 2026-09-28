import java.util.Scanner;

public class Appbanque {

    public static void main(String[] args) {

        int cin;
        String nom;
        String prenom;
        int nCompte;
        double solde = 1500.00;

        final float plafond_retrait = 500.00f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir le CIN :");
        cin = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Veuillez saisir le nom :");
        nom = scanner.nextLine();

        System.out.println("Veuillez saisir le prénom :");
        prenom = scanner.nextLine();

        System.out.println("Veuillez saisir le numéro du compte :");
        nCompte = scanner.nextInt();

        /*
         * System.out.println("\n--- Informations du client ---");
         * System.out.println("CIN : " + cin);
         * System.out.println("Nom : " + nom);
         * System.out.println("Prénom : " + prenom);
         * System.out.println("Numéro de compte : " + nCompte);
         * System.out.println("Plafond de retrait : " + plafond_retrait);/*
         */

        int choix;

        do {
            System.out.println("1. Consulter compte");
            System.out.println("2. Déposer montant");
            System.out.println("3. Retirer montant");
            System.out.println("4. Quitter");

            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Nom : " + nom + ", Prénom : " + prenom + ", CIN: " + cin);
                    System.out.println("Numéro de compte " + nCompte);
                    System.out.println("Solde actuel : " + solde + " DT");
                    System.out.println("Plafond de retrait : " + plafond_retrait + " DT");
                    break;
            }

        } while (choix != 4);

        scanner.close();
    }
}