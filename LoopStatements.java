import java.util.Scanner;

public class LoopStatements{
	public static void main(String[] args){
		System.out.print("Enter the perfect score: ");
		Scanner keyboard = new Scanner(System.in);
		int perfect_score = keyboard.nextInt();
		int[] scores = new int[0];
		while(true){
			System.out.print("How many scores are you going to enter?");
			byte index = keyboard.nextByte();
			if(index >= 1){
				scores = new int[index];
				break;
			}
		}
		int h = 0;
		do{
			System.out.print("Enter score: ");
			scores[h] = keyboard.nextInt();
			h++;
		}while(h<scores.length);

		for(int i = 0; i<scores.length;i++){
			if(scores[i] < (perfect_score * 0.70) && scores[i] >= 0){
				System.out.println(scores[i] + ":FAILED.");
			}else if(scores[i] >= (perfect_score * 0.70) && scores[i] < perfect_score){
				System.out.println(scores[i] + ":PASSED.");
			}else if(scores[i] == perfect_score){
				System.out.println(scores[i] + ":PERFECT");
			}else{
				System.out.println("Error!");
			}
		}
	}
}