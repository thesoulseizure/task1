package Task1;

import java.util.Scanner;

public class QuestionOne {
	public static void main(String[] args) {
		try (
		Scanner obj = new Scanner(System.in)) {
			System.out.println("Printing the numbers from 10 to 50 using while loop");
			System.out.println("Enter the starting number :");
			int i = obj.nextInt();
			while(i<=50) {
				System.out.print(i+" ");
				i++;
			}
			System.out.println();
			System.out.println();
			System.out.println("Printing the numbers from 10 to 50 using do while loop");
			System.out.println("Enter the starting number :");
			int k = obj.nextInt();
			do
			 {
				System.out.print(k+" ");
				k++;
			 }while(k<=50);
			System.out.println();
			System.out.println();
			System.out.println("Printing the numbers from 10 to 50 using for loop");
			System.out.println("Enter the starting number :");
			for(int j=obj.nextInt(); j<=50; j++) {
				System.out.print(j+" ");
			}
		}
	}
}
