import java.util.*;
import java.text.*;
import java.time.*;
//import java.time.Year;

public class DateTime{
	public static void main(String[] args){
		Date now = new Date();
		SimpleDateFormat birth = new SimpleDateFormat("yyyy-MM-dd");

		Scanner in = new Scanner(System.in);
		System.out.println("Type in your birth day in form of yyyy-MM-dd");
		String day = in.nextLine();
		System.out.print(day+ " Parse as ");
		Date date;
		try{
			date = birth.parse(day);
			System.out.print(date + "\n");
		}catch(ParseException e){
			System.out.println("Unparseable using "+ day+"\n"+e);
			return;
		}
		
		LocalDate birthDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate nowDate = now.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		int age = Period.between(birthDate, nowDate).getYears();
		System.out.println("Your age is " + age);

	}
}