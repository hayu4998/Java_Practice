import java.util.Scanner;
import static java.lang.System.out;


public class Dice{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		out.println("Dice Simulation");
		byte guess;
		while(true){
			out.print("Enter you bet(1-6)");
			guess = in.nextByte();
			if(guess >0 && guess<7){
				out.println("\nRolling dice...");
				byte dice = (byte)(Math.random()*6+1);
				System.out.println("\nDice: "+dice);
				if(guess == dice) out.println("You Win");
				else out.println("You lose!");
				break;
			}
		}
	}
}