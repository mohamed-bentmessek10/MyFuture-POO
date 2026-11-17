
import java.util.Scanner;

public class Tableau {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] t = new int[5];

        t[0] = 2;
        t[1] = 0;
        t[2] = 1;
        t[3] = 3;
        t[4] = 4;

        System.out.println("Avant modification :");
        for (int i = 0; i < 5; i++) {
            System.out.println("T[" + i + "] = " + t[i]);
        }

        t[1] = 2;

        System.out.println("\nApres modification :");
        for (int i = 0; i < 5; i++) {
            System.out.println("T[" + i + "] = " + t[i]);
        }

        int[] t2 = new int[5];

        System.out.println("\nSaisie du deuxieme tableau :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Donner t2[" + i + "] : ");
            t2[i] = sc.nextInt();
        }

        System.out.println("\nLes valeurs du deuxieme tableau :");
        for (int i = 0; i < 5; i++) {
            System.out.println("t2[" + i + "] = " + t2[i]);
        }
        System.out.println("\nLa longueur du tableau t : " + t.length);
        System.out.println("La longueur du tableau t2 : " + t2.length);
        int s = 0;
        for (int i = 0; i < 5; i++) {
            s = s + t[i];
        }

        System.out.println("La somme des elements du 1er tableau est : " + s);

        int s1 = 0;
        for (int i = 0; i < 5; i++) {
            s1 = s1 + t[i] + t2[i];
        }

        System.out.println("La somme des elements du deux tableaux est : " + s1);

    }
}
