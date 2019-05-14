import java.util.Scanner;

public class CoinToss{
	public static void main(String[] args){
		System.out.println("Coin Toss Simulation");
		System.out.println("[1]Head\t[2]Tail");
		if(((byte)Math.random()*2+1) == get_bet()){
			System.out.println("You Win");
		}else{
			System.out.println("You Lose");
		}
	}
	static byte get_bet(){
		System.out.println("What is your bet");
		Scanner in = new Scanner(System.in);
		return in.nextByte();
	}
}