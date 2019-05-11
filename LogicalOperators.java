import java.util.Scanner;

public class LogicalOperators{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two numebrs: ");
		int first_num = in.nextInt();
		int second_num = in.nextInt();
		System.out.println("First number is equal to 10 and second number is equal to 20?" + ((first_num==10)&&(second_num == 20)));
		System.out.println("First number is equal to 10 or second number is equal to 20?" + ((first_num == 10)||(second_num == 20)));
		System.out.println("First number is equal to 10?"+(first_num == 10));
		System.out.println("second number is equal to 20?"+(second_num == 20));
	}
}