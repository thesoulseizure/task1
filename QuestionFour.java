package Task1;

import java.util.Scanner;

public class QuestionFour {
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter the numbers");
			int a = obj.nextInt();
			int b = obj.nextInt();
			int c = obj.nextInt();
			if(a<=b && a<=c) {
				System.out.println("the smallest number is : " + a);
			}else if(b<=a && b<=c) {
				System.out.println("the smallest number is : "+ b);
			}else {
				System.out.println("the smallest number is : "+ c);
			}
		}
	}

}
