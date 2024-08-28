package Task1;

import java.util.Scanner;

public class QuestionThree {
	public static void main(String[] args) {
		    try (Scanner obj = new Scanner(System.in)) {
				System.out.println("Reversing a number using while loop");
				System.out.println("Enter the input :");
				int input = obj.nextInt();
				int output = 0;  
				while(input != 0)   
				{  
				int remainder = input % 10;  
				output = output * 10 + remainder;  
				input = input/10;  
				}  
				System.out.println("The reverse of the given number is: " + output);
				System.out.println("==================================");
				System.out.println("Reversing a number using for loop");
				int reverse = 0;  
				System.out.println("Enter the input :");
				for(int number = obj.nextInt(); number != 0; number=number/10){  
				int remainder = number % 10;  
				reverse = reverse * 10 + remainder;  
				}  
				System.out.println("The reverse of the given number is: " + reverse); 
				System.out.println("==================================");
                System.out.println("Reversing a number using do while loop");
                System.out.println("Enter the input :");
                int i = obj.nextInt();
                int o = 0;  
                do{  
                int remainder = i % 10;  
                o = o * 10 + remainder;  
                i = i/10;  
                }while(i != 0);   
                System.out.println("The reverse of the given number is: " + o);
			    }
			    System.out.println("==================================");
	            }
               }

