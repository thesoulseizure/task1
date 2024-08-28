package Task1;

import java.util.Scanner;

public class QuestionFive {
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter the Purchase Amount : ");
			int purchaseAmount = obj.nextInt();
			if(purchaseAmount < 500) {
				System.out.println("No discount is applied");
				int Final = purchaseAmount;
				System.out.println("Final Payable Amount is : " + Final);
			    }else if(purchaseAmount >=500 && purchaseAmount <=1000) {
				System.out.println("10% discount is applied");
				int discount = (10 * purchaseAmount) / 100 ;
				int Final = purchaseAmount - discount;
				System.out.println("Final Payable Amount is : " + Final);
			    }else {
			    System.out.println("20% discount is applied");
			    int discount = (20 * purchaseAmount) / 100 ;
			    int Final = purchaseAmount - discount;
			    System.out.println("Final Payable Amount is : " + Final);
			    }
		}
	}

}
