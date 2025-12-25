package exercice5;

public class Main {
public static void main(String [] args){
	
	
    int[] t1 = {1};
    int[] t2 = {1, 2, 3, 4, 5};
    int[] t3 = {2, 3, 4, 5, 1};
    int[] t4 = {4, 5, 1, 2, 3};
    int[] t5 = {3, 1, 2, 4, 5};
    int[] t6 = {1, 2, 2, 3, 4};
    int[] t7 = {0, 1, 2, 3, 4};

    System.out.println("t1 -> " + Permutation.estPermutationCirculaire(t1)); 
    System.out.println("t2 -> " + Permutation.estPermutationCirculaire(t2)); 
    System.out.println("t3 -> " + Permutation.estPermutationCirculaire(t3)); 
    System.out.println("t4 -> " + Permutation.estPermutationCirculaire(t4)); 
    System.out.println("t5 -> " + Permutation.estPermutationCirculaire(t5)); 
    System.out.println("t6 -> " + Permutation.estPermutationCirculaire(t6)); 
    System.out.println("t7 -> " + Permutation.estPermutationCirculaire(t7)); 
}
}
