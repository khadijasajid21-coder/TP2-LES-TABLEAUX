package exercice6;

public class Kadane {
	
	
	public static int maxSubarraySum(int[] t) {

	    if (t == null || t.length == 0) {
	        throw new IllegalArgumentException("Le tableau ne doit pas être vide.");
	    }

	    int currentSum = t[0];
	    int maxSum = t[0];

	    for (int i = 1; i < t.length; i++) {
	        currentSum = Math.max(t[i], currentSum + t[i]);
	        maxSum = Math.max(maxSum, currentSum);
	    }

	    return maxSum;
	}
	
	public static int[] maxSubarrayWithIndices(int[] t) {

	    if (t == null || t.length == 0) {
	        throw new IllegalArgumentException("Le tableau ne doit pas être vide.");
	    }

	    int currentSum = t[0];
	    int maxSum = t[0];

	    int start = 0;
	    int bestStart = 0;
	    int bestEnd = 0;

	    for (int i = 1; i < t.length; i++) {

	        if (t[i] > currentSum + t[i]) {
	            currentSum = t[i];
	            start = i; 
	        } else {
	            currentSum += t[i];
	        }

	        if (currentSum > maxSum) {
	            maxSum = currentSum;
	            bestStart = start;
	            bestEnd = i;
	        }
	    }

	    return new int[]{maxSum, bestStart, bestEnd};
	}
	public static void main(String [] args) {
		int[] t = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

		System.out.println(maxSubarraySum(t)); 

		int[] res = maxSubarrayWithIndices(t);
		System.out.println("Somme = " + res[0]);      
		System.out.println("Début = " + res[1]);      
		System.out.println("Fin = " + res[2]);        

	}

}
