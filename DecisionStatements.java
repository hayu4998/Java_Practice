import java.util.Scanner;

public class DecisionStatements{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter years of service in the company: ");
		int years = in.nextInt();
		switch(years){
			case 0: 
				System.out.print("No Benefits yet!");
				break;
			case 5:
				System.out.print("Free car!");
				break;
			case 15: 
				System.out.print("Free house and lot!");
				break;
			default: 
				System.out.print("Error!");

		}
		System.out.print("Enter number of hrs worked in a month");
		int hours = in.nextInt();
		if(hours == 176){
			System.out.println("You will receive an extra $250 as a bouns.");
		}else if(hours <= 242){
			System.out.println("You will receive an extra $1500 as a bouns.");

		}else if(hours < 176){
			System.out.println("You are fired!");
		}else{
			System.out.println("Are you fking with me?");
		}

	}
}