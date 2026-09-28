import java.util.Scanner;

public class Appbanque {

    public static void main(String[] args) {

        int cin;
        String nom;
        String prenom;
        int nCompte;

        final float plafond_retrait = 500.00f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir le CIN :");
        cin = scanner.nextInt();
        scanner.nextLine(); // récupérer le Enter

        System.out.println("Veuillez saisir le nom :");
        nom = scanner.nextLine();

        System.out.println("Veuillez saisir le prénom :");
        prenom = scanner.nextLine();

        System.out.println("Veuillez saisir le numéro du compte :");
        nCompte = scanner.nextInt();

        System.out.println("\n--- Informations du client ---");
        System.out.println("CIN : " + cin);
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Numéro de compte : " + nCompte);
        System.out.println("Plafond de retrait : " + plafond_retrait);

        scanner.close();
    }
}