import java.util.Scanner;

public class CommissionRate{
	public static void main(String[] args){
		double sales = get_sales();
		double advanced_pay = get_advanced_pay();
		double comm_rate = determine_comm_rate(sales);

		double pay = sales * comm_rate - advanced_pay;
		System.out.printf("The pay is Php %.2f", pay);

		if(pay < 0)System.out.println("The salesperson must must reimburse the company");
	}

	static Scanner in = new Scanner(System.in);

	static double get_sales(){
		System.out.print("Enter monthly sales");
		return in.nextDouble();
	}

	static double get_advanced_pay(){
		System.out.print("Enter advanced pay");
		return in.nextDouble();
	}

	static double determine_comm_rate(double sales){
		if(sales < 10000) return 0.1;
		else if(sales < 14999) return 0.12;
		else if(sales < 17999) return 0.14;
		else if(sales < 21999) return 0.16;
		else return 0.2;
	}
}