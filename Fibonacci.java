package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fibonacci SEquence :0,1,12,3,5,8,13,21,34,55.....
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input max sequence number:");
		int number = input.nextInt();
		int fibPrevious =0, fibonacci =1, sum = 0;
		for (int i=1; i<=number; i++) {
			System.out.println(fibPrevious +"");
			sum = fibPrevious + fibonacci;
			fibPrevious = fibonacci;
			fibonacci = sum;
		}

	}

}
