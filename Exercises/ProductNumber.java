import java.util.Scanner;

public class ProductNumber{
	public static void main(String[] arguments){
		Scanner in = new Scanner(System.in);
		System.out.println("Please key in a string");
		String input = in.nextLine();
		int product = 1;
		boolean indicator = false;
		for(int i = 0 ; i < input.length(); i++){
			if(Character.isDigit(input.charAt(i))){
				product *= Character.getNumericValue(input.charAt(i));
				indicator = true;
			}
		}
		if(indicator){
			System.out.println("The product is " + product);
		}else{
			System.out.println("No number detected.");
		}
	}
}