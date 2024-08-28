package Task1;

import java.util.Scanner;

public class QuestionSix {
	 public static void main(String[] args) {
	        try (Scanner obj = new Scanner(System.in)) {
				System.out.println("Enter the number of rows");
				 int r = obj.nextInt();
				 System.out.println("Enter the number of columns");
				 int c = obj.nextInt();
				int[][] arr = new int[r][c];
  	            System.out.println("Enter the elements");
				for(int i=0; i<r; i++){
				    for(int j=0; j<c; j++){	
				        arr[i][j] = obj.nextInt();
				    }
				    System.out.println();
				}
				System.out.println("The required Pattern is as follows");
				System.out.println("");
				for(int i=0; i<r; i++){
				    for(int j=0; j<c; j++){
				        System.out.print(arr[i][j]+" ");
				    }
				    System.out.println();
				}
			}
	    }
	}
