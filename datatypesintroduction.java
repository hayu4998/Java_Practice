import java.util.Scanner;
public class datatypesintroduction{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Who are you?");
		String name = keyboard.nextLine();
		System.out.println("Hello there " + name + "!");
		keyboard = new Scanner(System.in);
		System.out.println("How old are you?");
			byte age = keyboard.nextByte(); 
			System.out.println("Wow! You are just "+age+" years old!");
			System.out.println("Do you have books? Howmany book do you have ?");
			short number_of_books = keyboard.nextShort();
			System.out.println(number_of_books + "? Impressive.");
			System.out.println("Anyway, let's do some math. Will you give me two numbers?");
			int num_one = keyboard.nextInt();
			double number_two = keyboard.nextDouble();
			float product = (float)(num_one * number_two);
			System.out.println("The product of " + num_one + " and " + number_two+ " is " + product);
			final double PI = 3.1415926;
			System.out.print("Give me a radius");
			double radius = keyboard.nextDouble();
			double circumference = 2*PI*radius;
			System.out.printf("\nThe circumference of your circle is %3fcm\n",circumference);
	}
}