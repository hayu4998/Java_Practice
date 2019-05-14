import java.util.Scanner;
import static java.lang.System.out;

public class Array{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String[] students = {"Mark","Jane","AlphaGo","May","Alan"};
		System.out.print("Enter student number");
		String student_no = in.nextLine();
		switch(student_no){
			case "1" : out.println("student: " + students[0]);break;
			case "2" : out.println("student: " + students[1]);break;
			case "3" : out.println("student: " + students[2]);break;
			case "4" : out.println("student: " + students[3]);break;
			case "5" : out.println("student: " + students[4]);break;
			default: out.println("404");
		}
	}
}