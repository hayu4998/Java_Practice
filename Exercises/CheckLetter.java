import java.util.Scanner;

public class CheckLetter{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String tar = in.nextLine();
		System.out.print("Enter the letter that you want to check for: ");
		String s = in.nextLine();
		char c = s.charAt(0);
		for(int i = 0; i < tar.length(); i++){
			if(tar.charAt(i) == Character.toUpperCase(c) || tar.charAt(i) == Character.toLowerCase(c)){
				System.out.print("We found it at " + (i+1) + " position");
				break;
			}
		}
	}

}