package Task1;

import java.util.Scanner;

public class QuestionSixA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f, i, j;
		System.out.println("Enter number of rows");
		f = sc.nextInt();

		for (i = f; i >= 1; i--) {
			for (j = f; j >= 1; j--) {
				System.out.print(i > j ? i : j);
			}
			System.out.println();
		}

	}

}
