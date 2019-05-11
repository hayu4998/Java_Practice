import java.util.Scanner;

public class ArithmeticOperators{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = keyboard.nextInt();
		System.out.print("Enter second number:");
		int num2 = keyboard.nextInt();
		
		int ans = num1*num2;
		System.out.println("The sum of two number is "+ ans);
		
		ans = num1 - num2;
		System.out.println("The difference between two number is "+ ans);
		
		ans = num1 * num2;
		System.out.println("The product of two number is "+ ans);
		
		ans = num1/ num2;
		System.out.println("The Quotient of two number is " + ans);

		ans = num1%num2;
		System.out.println("Remainder of two number is " + ans);
	}
}