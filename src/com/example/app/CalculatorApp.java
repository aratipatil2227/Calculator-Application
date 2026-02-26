package com.example.app;

import java.util.Scanner;

public class CalculatorApp {

	//method for addition
	public static double add(double a, double b) {
		return a+b;
	}
	
	//method for substract
	public static double subtract(double a ,double b) {
		return a-b;
	}
	
	//method for multiply
	public static double multiply(double a ,double b) {
		return a*b;
		
	}
	
	//method for division
	public static double divide(double a, double b)throws ArithmeticException{
		if (b==0) {
			throw new ArithmeticException("error: division by zero is not allowed.");
			
		}
		return a/b;
	}
	
	//main method 
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int choice;
		double num1 ,num2, result;
		
		do {
			System.out.println("***Basic CalculatorApp***");
			System.out.println("1. Addition");
			System.out.println("2. substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exite");
			System.out.println("select any option from (1-5)");
			
			choice=sc.nextInt();
			
			if (choice >=1 && choice <=4) {
				System.out.print("Enter first Number:");
				num1 =sc.nextDouble();
				System.out.print("Enter second Number:");
				num2 =sc.nextDouble();
				
				try {
					
					switch (choice) {
					case 1:
						
						result = add(num1, num2);
						System.out.println("Result:"+ result);
						break;

                    case 2:
						
						result = subtract(num1, num2);
						System.out.println("Result:"+ result);
						break;
					
			     	case 3:
					    result = multiply(num1, num2);
					    System.out.println("Result:"+ result);
					    break;
					    
					case 4:
						result = divide(num1, num2);
						System.out.println("Result:"+ result);
						break;
						
					}
				} catch (ArithmeticException e) {
					System.out.println(e.getMessage());
				}
			}else if(choice ==5 ) {
			    System.out.println("Thank you for using calculator: ");
		     }else {
		 	   System.out.println("invalid choice .please select between 1-5.");
		   }
		 				
		} while (choice !=5);
		sc.close();
	}
}

