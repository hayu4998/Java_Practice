import java.util.Scanner;

public class GetSalePrice{
	public static void main(String[] args){
		double regular_price = get_regular_price();
		double sale_price = regular_price - getDiscountPrice(regular_price);
		System.out.printf("Discounted price: Php %.2f",sale_price);	
	}
	static double get_regular_price(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter item's regular price Php");
		return in.nextDouble();
	}
	static double getDiscountPrice(double regular_price){
		final double DISCOUNT_PERCENTAGE = 0.20;
		return regular_price*DISCOUNT_PERCENTAGE;
	}
}