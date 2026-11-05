public class main {
    public static void main(String[] args) {
        Produit p = new Produit("Ref1", "ordinateur", 350, 7);
        p.afficher();
        p.CalculerValeurStock();
        p.appliquerRemise(10);
        p.afficher();
    }
}