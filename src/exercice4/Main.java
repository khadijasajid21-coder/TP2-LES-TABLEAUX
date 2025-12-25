package exercice4;

import exercice4.MaxRectangle.Rectangle;

public class Main {

		 public static void main(String[] args) {
		        int[][] mat1 = {
		            {0,1,1,0,1},
		            {1,1,1,1,0},
		            {1,1,1,1,0},
		            {1,1,0,0,1}
		        };

		        int[][] mat2 = {
		        		{1,1,1},{1,1,1}, {1,1,1}
		       
		        };

		        int[][] mat3 = {
		            {0,0,0},
		            {0,0,0}
		        };

		        System.out.println("Test matrice 1 :");
		        Rectangle r1 = MaxRectangle.trouverMaxRectangle(mat1);
		        System.out.println(r1);

		        System.out.println("Test matrice 2:");
		        Rectangle r2 = MaxRectangle.trouverMaxRectangle(mat2);
		        System.out.println(r2);

		        System.out.println("Test matrice 3:");
		        Rectangle r3 = MaxRectangle.trouverMaxRectangle(mat3);
		        System.out.println(r3);
		    
	

	
	 }

	
	
}
