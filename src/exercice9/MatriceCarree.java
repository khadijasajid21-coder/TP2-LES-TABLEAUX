package exercice9;

public class MatriceCarree {

	public static int differenceDiagonales(int[][] m) {

	    if (m == null || m.length == 0) {
	        throw new IllegalArgumentException("La matrice ne doit pas être vide.");
	    }

	    int n = m.length;

	   
	    for (int i = 0; i < n; i++) {
	        if (m[i].length != n) {
	            throw new IllegalArgumentException("La matrice doit être carrée.");
	        }
	    }

	    int sommePrincipale = 0;
	    int sommeSecondaire = 0;

	    for (int i = 0; i < n; i++) {
	        sommePrincipale += m[i][i];
	        sommeSecondaire += m[i][n - 1 - i];
	    }

	    int diff = sommePrincipale - sommeSecondaire;
	    int absDiff = Math.abs(diff);

	    System.out.println("Somme diagonale principale = " + sommePrincipale);
	    System.out.println("Somme diagonale secondaire = " + sommeSecondaire);
	    System.out.println("Différence absolue = " + absDiff);

	    return absDiff;
	}

	public static void main(String[] args) {

	    int[][] m1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	    };

	    differenceDiagonales(m1);

	    int[][] m2 = {
	            {1, 3, 5},
	            {2, 4, 6},
	            {7, 8, 9}
	    };

	    differenceDiagonales(m2);

	    int[][] m3 = {
	            {5}
	    };

	    differenceDiagonales(m3);

	    int[][] m4 = {
	            {-1, 2},
	            {3, -4}
	    };

	    differenceDiagonales(m4);
	}


}
