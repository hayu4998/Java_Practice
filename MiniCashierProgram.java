import javax.swing.JOptionPane;

class Cashier{
	int display_menu(){
		String display_message = "Choose item to order. \n\t[1] Diamond necklace($10,000) \n\t[2] Silver ring($20) \n\t[3] IPhone 7 Plus($800)";
		return Integer.parseInt(JOptionPane.showInputDialog(null,display_message));
	}
	void pay_item(int choice){
		double amount_due = 0,change;
		switch(choice){
			case 1: amount_due = 10000;break;
			case 2: amount_due = 20;break;
			case 3: amount_due = 800;break;
		}
		double cash = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your payment"));
		if(cash>amount_due){
			change = cash - amount_due;
			JOptionPane.showMessageDialog(null, "Amount Due: $"+amount_due+"\nCash: $"+cash+"\nChange: $"+change);
		}else{
			JOptionPane.showMessageDialog(null,"Insufficient amount!");
		}
	}
}

public class MiniCashierProgram{
	public static void main(String[] args){
		Cashier a = new Cashier();
		int choice = 0;
		do{
			choice = a.display_menu();
		}while(choice <= 0 || choice > 3);

		a.pay_item(choice);
	}
}