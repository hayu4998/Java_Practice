import java.util.Scanner;

class Cellphone{
	String model_,price_;
	Cellphone(String model, String price){
		model_ = model;
		price_ = price;
	}
	String get_model(){
		return model_;
	}
	String get_price(){
		return price_;
	}
}

public class CellphoneObject{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter phone model: ");
		String model = in.nextLine();
		System.out.print("Enter phone price:Php ");
		String price = in.nextLine();

		System.out.println();
		Cellphone phone = new Cellphone(model, price);
		System.out.println("Phone model: " + phone.get_model());
		System.out.println("Phone price: Php " + phone.get_price());
	}
}
