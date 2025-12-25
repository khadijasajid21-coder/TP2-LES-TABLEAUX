package exercice7;

import java.util.HashMap;
import java.util.Map;

public class Majoritaire {

	public static int elementMajoritaireNaif(int[] t) {

		if (t == null || t.length == 0) {
			return -1;
		}

		Map<Integer, Integer> freq = new HashMap<>();

		for (int x : t) {
			freq.put(x, freq.getOrDefault(x, 0) + 1);
		}

		int n = t.length;

		for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
			if (e.getValue() > n / 2) {
				return e.getKey();
			}
		}

		return -1;
	}
	public static int elementMajoritaire(int[] t) {

	    if (t == null || t.length == 0) {
	        return -1;
	    }

	   
	    int candidat = 0;
	    int compteur = 0;

	    for (int x : t) {
	        if (compteur == 0) {
	            candidat = x;
	            compteur = 1;
	        } else if (x == candidat) {
	            compteur++;
	        } else {
	            compteur--;
	        }
	    }

	 
	    int occurrences = 0;
	    for (int x : t) {
	        if (x == candidat) {
	            occurrences++;
	        }
	    }

	    if (occurrences > t.length / 2) {
	        return candidat;
	    }

	    return -1;
	}

	public static void main(String [] args) {
		System.out.println(elementMajoritaire(new int[]{3, 3, 4, 3, 5})); 
		System.out.println(elementMajoritaire(new int[]{1, 2, 3, 4}));     
		System.out.println(elementMajoritaire(new int[]{2, 2, 2, 1, 3}));  
		System.out.println(elementMajoritaire(new int[]{7}));              
		System.out.println(elementMajoritaire(new int[]{}));               

	}

}
