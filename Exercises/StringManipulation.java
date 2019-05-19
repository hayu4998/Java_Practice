import java.util.Scanner;

public class StringManipulation{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String tar = in.nextLine();
		System.out.print("Enter ith number that you want to exptract");
		int pos = in.nextInt() - 1;
		System.out.println(get_char(tar,pos));
	}

	static char get_char(String tar, int pos){
		/*
		try(char c = tar[pos]){
			return c;
		}catch(Exception){

		}
		*/
		return tar.charAt(pos);
	}
}