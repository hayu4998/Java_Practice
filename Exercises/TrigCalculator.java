import java.util.Scanner;

public class TrigCalculator{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("[D]egree/[R]adian?");
		char s = in.next().charAt(0);
		boolean mode;
		while(true){
			if(s == 'D' || s == 'd'){
				mode = true;
				break;
			}
			if(s == 'R' || s == 'r'){
				mode = false;
				break;
			}
			System.out.println("Invalid input, key in D for degree or R for radian");
			s = in.next().charAt(0);
		}

		double num;
		int id = getIdentity();


		if(mode){
			System.out.println("Please key in `triangle in degree");
			num = in.nextFloat();
			num = Math.toRadians(num);
			
		}else{
			System.out.println("Please key in triangle in radian");
			num = in.nextFloat();
		}
		double result = 0;
		switch(id){
			case 1: result = Math.cos(num);
			case 2: result = Math.sin(num);
			case 3: result = Math.tan(num);
			case 4: result = 1/Math.cos(num);
			case 5: result = 1/Math.sin(num);
			case 6: result = 1/Math.tan(num);
			default: result = 0;
		}
		System.out.println("The result is "+ result);
			
	}

	static int getIdentity(){
		
		System.out.println("What Trigonometric function that you seek: [Cos]/[Sin]/[Tan]/[Sec]/[Csc]/[Cot].");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		switch(input){
			case "Cos": return 1;
			case "Sin": return 2;
			case "Tan": return 3;
			case "Sec": return 4;
			case "Csc": return 5;
			case "Cot": return 6;
			default: System.out.println("Invalid input!"); return getIdentity();
		}
	}
}