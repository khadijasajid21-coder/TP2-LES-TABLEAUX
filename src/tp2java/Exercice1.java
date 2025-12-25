package tp2java;

public class Exercice1 {

	
    public static void main(String[] args) {

        int[] t = {2, 1, 4, 2, 3, 5, 1, 7};

        System.out.println("Longueur = " + lis(t));
    }

    public static int lis(int[] t) {

        int n = t.length;

        if (n == 0) return 0;

       
        int[] dp = new int[n];

   
        for (int i = 0; i < n; i++) dp[i] = 1;

        int max = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (t[j] < t[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (dp[i] > max) max = dp[i];
        }

        return max;
    }
}
