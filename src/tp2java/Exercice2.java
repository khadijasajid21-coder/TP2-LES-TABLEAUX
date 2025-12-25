package tp2java;

public class Exercice2 {

    public static void main(String[] args) {

        int[] t = { 2, 4, 3, 5, 6 };

        System.out.print("Pivots : ");
        afficherPivots(t);
    }

    public static void afficherPivots(int[] t) {

        int n = t.length;

        if (n == 0) return;

        int[] maxGauche = new int[n];
        int[] minDroite = new int[n];

       
        maxGauche[0] = t[0]; 
        for (int i = 1; i < n; i++) {
            maxGauche[i] = Math.max(maxGauche[i - 1], t[i - 1]);
        }

        minDroite[n - 1] = t[n - 1]; 
        for (int i = n - 2; i >= 0; i--) {
            minDroite[i] = Math.min(minDroite[i + 1], t[i + 1]);
        }

      
        for (int i = 0; i < n; i++) {
            if (maxGauche[i] < t[i] && t[i] < minDroite[i]) {
                System.out.print(t[i] + " ");
            }
        }
    }
}
