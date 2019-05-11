import java.util.Scanner;

public class MathMethods{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Let's apply some Math methods to a numebr: ");
		int number = in.nextInt();
		System.out.println("Square root of " + number + " is equal to " + Math.sqrt(number));
		System.out.println("Absolution value of " + number + " is equal to "+ Math.abs(number));
		System.out.println("Radians value of " + number + " is equal to " + Math.toRadians(number));
		System.out.println("Cosine of " + number + " is equal to " + Math.cos(Math.toRadians(number)));
		System.out.print("\nGive me another number: ");
		int base = in.nextInt();
		System.out.print("Give me a number to serve as an exponent.");
		int exponent = in.nextInt();
		System.out.println(base + " raise to " + exponent + " is equal to " + Math.pow(base,exponent));

	}
}