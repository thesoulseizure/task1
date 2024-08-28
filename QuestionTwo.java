package Task1;

import java.util.Scanner;

public class QuestionTwo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number you want to check");
			int num = sc.nextInt();
			if(num > 0) {
				System.out.println("The number is positive");
			}else if(num < 0) {
				System.out.println("The number is negative");
			}else {
				System.out.println("The number is neither positive nor negative i.e. it is zero");
			}
		}
	}

}
