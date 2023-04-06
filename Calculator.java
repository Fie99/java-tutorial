package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("---------CALCULATOR----------");
		System.out.println("please enter 2 int numbers");
		int number1, number2, number3;
		number1 = input.nextInt();
		number2 = input.nextInt();
		System.out.println("choose an operation(+,-,*,/,%)");
		char operator = input.next().charAt(0);
		int result = 0;
		//OR double result = 0.0; gives answer in as 9.0
		
		switch (operator) {
			case '+':
				result = number1 +number2; 
				break;
			case '-':
				result = number1 - number2;
				break;
			case '*':
				result = number1 *number2;
				break;
			case '/':
				result = number1 /number2;
				break;
			case '%':
				result = number1 %number2;
				break;
				default:
					System.out.println("Invalid choice");
					break;
		}
		System.out.println(number1 +" "+operator+" "+number2 +"=" +result);
		input.close();
		}
		
	

	}


