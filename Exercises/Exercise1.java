import java .util.Scanner;

public class Exercise1{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		String month;
		System.out.println("Enter the month");
		month = in.nextLine();
		System.out.println("Enter how many days in the month");
		int date = in.nextInt();

		String gap_1_digit = "  ";
		String gap_day = "   ";
		String gap_2_digit = " ";

		int max_date = 30;

		String [] day = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		System.out.println("                 "+month);
		
		for(int i = 0; i<7;i++){
			System.out.print(day[i]+gap_day);
		}

		System.out.print("\n");

		for(int i = 0 ; i < 5; i++){
			for(int j = 0; j<7; j++){
				int d = i*7+j+1;
				if(d <= date){
					if(d < 10){ System.out.print(d+gap_1_digit+gap_day);}else{ System.out.print(d+gap_2_digit+gap_day);}	
				}else{
					break;
				}
				
			}
			System.out.print("\n");
		}

	}
}