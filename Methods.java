//package pkg11.methods;
import javax.swing.JOptionPane;

public class Methods{
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null,"This program will add two numbers");
		int first_num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number"));
		int second_num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number"));
		int total = addNumbers(first_num,second_num);
		JOptionPane.showMessageDialog(null,"The sum of "+ first_num+" and "+second_num+" is "+total);
		JOptionPane.showMessageDialog(null, "This Program will now multiply two numbers");

		first_num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number"));
		second_num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number"));
		
		multiplyNumbers(first_num,second_num);
	}
	public static int addNumbers(int x, int y){
		return x+y;
	}

	public static void multiplyNumbers(int x, int y){
		int product = x*y;
		JOptionPane.showMessageDialog(null, "The product of " +x+" and "+y+" is "+ product);
	}
}
