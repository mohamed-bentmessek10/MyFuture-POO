
import java.util.Scanner;

public class Etudiant {

    static Scanner scanner = new Scanner(System.in);

    String codeE;
    String nom;
    String prenom;
    int age;
    String ville;

    static double[] notes = new double[3];

    // Constructeur
    public Etudiant(String code, String nom, String prenom, int age, String ville) {
        this.codeE = code;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.ville = ville;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Saisir les informations
    public void saisirEtudiant() {

        System.out.print("Code de l'etudiant : ");
        this.codeE = scanner.nextLine();

        System.out.print("Nom : ");
        this.nom = scanner.nextLine();

        System.out.print("Prenom : ");
        this.prenom = scanner.nextLine();

        System.out.print("Age : ");
        this.age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ville : ");
        this.ville = scanner.nextLine();
    }

    // Afficher les informations
    public void afficherEtudiant() {

        System.out.println("Code : " + this.codeE);
        System.out.println("Nom : " + this.nom);
        System.out.println("Prenom : " + this.prenom);
        System.out.println("Age : " + this.age);
        System.out.println("Ville : " + this.ville);
    }

    // Saisir les 3 notes
    public static double[] creerTableauNotes() {

        for (int i = 0; i < notes.length; i++) {

            System.out.print("Entrez la note " + (i + 1) + " : ");
            notes[i] = scanner.nextDouble();
        }

        return notes;
    }

    // Afficher la plus grande note
    public static double afficherPlusGrandeNote(double[] notes) {

        double max = notes[0];

        for (int i = 1; i < notes.length; i++) {

            if (notes[i] > max) {
                max = notes[i];
            }
        }

        return max;
    }

    // MENU PRINCIPAL
    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant("", "", "", 0, "");
        boolean notesSaisies = false;

        int choix;

        do {

            System.out.println("\n========== MENU ETUDIANT ==========");
            System.out.println("1. Saisir les informations");
            System.out.println("2. Afficher les informations");
            System.out.println("3. Saisir les notes");
            System.out.println("4. Afficher la plus grande note");
            System.out.println("5. Modifier le nom");
            System.out.println("6. Modifier le prenom");
            System.out.println("7. Afficher le nom et le prenom");
            System.out.println("0. Quitter");
            System.out.println("==================================");

            System.out.print("Choisissez un service : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {

                case 1:
                    etudiant.saisirEtudiant();
                    System.out.println("Informations saisies avec succes !");
                    break;

                case 2:
                    System.out.println("\nInformations de l'etudiant :");
                    etudiant.afficherEtudiant();
                    break;

                case 3:
                    System.out.println("\nSaisie des notes :");
                    creerTableauNotes();
                    notesSaisies = true;
                    System.out.println("Notes saisies avec succes !");
                    break;

                case 4:
                    if (notesSaisies) {
                        double max = afficherPlusGrandeNote(notes);
                        System.out.println("La plus grande note est : " + max);
                    } else {
                        System.out.println("Veuillez saisir les notes d'abord !");
                    }
                    break;

                case 5:
                    System.out.print("Nouveau nom : ");
                    String nouveauNom = scanner.nextLine();
                    etudiant.setNom(nouveauNom);
                    System.out.println("Nom modifie avec succes !");
                    break;

                case 6:
                    System.out.print("Nouveau prenom : ");
                    String nouveauPrenom = scanner.nextLine();
                    etudiant.setPrenom(nouveauPrenom);
                    System.out.println("Prenom modifie avec succes !");
                    break;

                case 7:
                    System.out.println("Nom : " + etudiant.getNom());
                    System.out.println("Prenom : " + etudiant.getPrenom());
                    break;

                case 8:
                    System.out.println("Merci d'avoir utilise notre programme !");
                    break;

                default:
                    System.out.println("Choix invalide ! Reessayez.");
            }

        } while (choix != 0);

        scanner.close();
    }
}
