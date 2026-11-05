import java.util.Scanner;

public class produit {

    private String reference;
    private String designation;
    private double prixHT;
    private int quantiteStock;

    // Constructeur vide
    public produit() {
    }

    // Constructeur avec parametres
    public produit(String reference, String designation,
            double prixHT, int quantiteStock) {
        this.reference = reference;
        this.designation = designation;
        this.prixHT = prixHT;
        this.quantiteStock = quantiteStock;
    }

    // Getters et Setters
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    // Afficher les details
    public void afficher() {
        System.out.println("Reference : " + reference);
        System.out.println("Designation : " + designation);
        System.out.println("Prix HT : " + prixHT);
        System.out.println("Quantite Stock : " + quantiteStock);
    }

    // Calculer valeur stock
    public double calculerValeurStock() {
        return prixHT * quantiteStock;
    }

    // Appliquer remise
    public double appliquerRemise(double pourcentage) {
        return prixHT - (prixHT * pourcentage / 100);
    }

    // Main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Donner la quantite en stock :");
        int quantite = sc.nextInt();

        System.out.println("Donner le prix HT :");
        double prixHT4 = sc.nextDouble();

        produit p = new produit("ref1", "ordinateur", 750.5, quantite);

        produit p1 = new produit("ref1", "ordinateur", prixHT4, quantite);

        int choix;

        do {

            System.out.println("\n------ MENU ------");
            System.out.println("1- Afficher les details du produit");
            System.out.println("2- Calculer la valeur du stock");
            System.out.println("3- Appliquer une remise");
            System.out.println("4- Quitter");

            System.out.println("Donner votre choix :");
            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("--- Produit p ---");
                    p.afficher();

                    System.out.println("--- Produit p1 ---");
                    p1.afficher();
                    break;

                case 2:
                    System.out.println("Valeur du stock : "
                            + p1.calculerValeurStock());
                    break;

                case 3:
                    System.out.println("Donner le pourcentage de remise :");
                    double remise = sc.nextDouble();

                    System.out.println("Prix apres remise : "
                            + p1.appliquerRemise(remise));
                    break;

                case 4:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 4);

        sc.close();
    }
}
