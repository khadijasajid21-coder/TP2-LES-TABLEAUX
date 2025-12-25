package exercice5;

public class Permutation {
	public static boolean estPermutationCirculaire(int[] t) {
	    int n = t.length;
	    boolean[] vu = new boolean[n + 1];

	  
	    for (int x : t) {
	        if (x < 1 || x > n) return false;
	        if (vu[x]) return false;
	        vu[x] = true;
	    }

	   
	    int pos = -1;
	    for (int i = 0; i < n; i++) {
	        if (t[i] == 1) {
	            pos = i;
	            break;
	        }
	    }

	
	    for (int k = 0; k < n; k++) {
	        int idx = (pos + k) % n;
	        if (t[idx] != k + 1) return false;
	    }

	    return true;
	}

}
