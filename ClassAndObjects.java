import java.util.Scanner;

class Animal{
	String name_;
	void setName(String name){name_ = name;};
	void displayName(){System.out.println("The Animal's name is "+name_);}
}

public class ClassAndObjects{
	public static void main(String[] args){
		System.out.println("Creating octopus");
		Animal octopus = new Animal();
		System.out.println("Name your octopus");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		octopus.setName(name);
		octopus.displayName();
	}
}