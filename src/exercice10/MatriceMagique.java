package exercice10;

public class MatriceMagique {

	public static boolean estCarreMagique(int[][] m) {

		if (m == null || m.length != 3) {
			throw new IllegalArgumentException("La matrice doit être 3x3.");
		}
		for (int i = 0; i < 3; i++) {
			if (m[i].length != 3) {
				throw new IllegalArgumentException("La matrice doit être 3x3.");
			}
		}

		int ref = m[0][0] + m[0][1] + m[0][2];

		for (int i = 1; i < 3; i++) {
			int sommeLigne = m[i][0] + m[i][1] + m[i][2];
			if (sommeLigne != ref) {
				return false;
			}
		}

		for (int j = 0; j < 3; j++) {
			int sommeCol = m[0][j] + m[1][j] + m[2][j];
			if (sommeCol != ref) {
				return false;
			}
		}

		int diagPrincipale = m[0][0] + m[1][1] + m[2][2];
		int diagSecondaire = m[0][2] + m[1][1] + m[2][0];

		if (diagPrincipale != ref || diagSecondaire != ref) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {

	    int[][] magique = {
	        {8, 1, 6},
	        {3, 5, 7},
	        {4, 9, 2}
	    };

	    int[][] nonMagique = {
	        {2, 7, 6},
	        {9, 5, 1},
	        {4, 3, 7} // 7 au lieu de 8
	    };

	    int[][] tousEgaux = {
	        {1, 1, 1},
	        {1, 1, 1},
	        {1, 1, 1}
	    };

	    if (estCarreMagique(magique))
	        System.out.println("Carré magique");
	    else
	        System.out.println("Pas un carré magique");

	    if (estCarreMagique(nonMagique))
	        System.out.println("Carré magique");
	    else
	        System.out.println("Pas un carré magique");

	    if (estCarreMagique(tousEgaux))
	        System.out.println("Carré magique");
	    else
	        System.out.println("Pas un carré magique");
	}


}
