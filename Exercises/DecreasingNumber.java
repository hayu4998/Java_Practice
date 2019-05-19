import java.util.Scanner;

public class DecreasingNumber{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		boolean choice = true;
		float[] store = new float[500];
		System.out.println("Please type in a score");
		int count = 0;
		
		do{
			store[count] = in.nextFloat();
			System.out.println("Do you want to key in another score[Y/n]");
			char x = in.next().charAt(0);
			if(x != 'Y'){choice = false;}
			else{
				System.out.println("Please type in a score");
			}
			count++;
		}while(choice);

		if(count==1){
			System.out.println("True");
		}else{
			float tmp = store[0];
			for(int i = 1; i<count;i++){
				if(store[i] > tmp){
					System.out.println("False");
					return;
				}else{
					tmp = store[i];
				}
			}
		}
		System.out.println("true");
		return;
	}
}