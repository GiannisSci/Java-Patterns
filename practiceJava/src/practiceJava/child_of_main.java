package practiceJava;

import java.util.Scanner;

public class child_of_main extends Main {
	   public void multiplication(double x, double y) {
		      z = x * y;
		      System.out.println("The product of the given numbers:"+z);
		   }
			
		   public static void main(String args[]) {
			   Scanner reader = new Scanner(System.in);
			   System.out.println("Enter 2 numbers: ");
			   double a = reader.nextDouble();
			   double b = reader.nextDouble();
			
		      child_of_main demo = new child_of_main();
		      demo.addition(a, b);
		      demo.Subtraction(a, b);
		      demo.multiplication(a, b);
		   }
		}
