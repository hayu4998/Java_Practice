public class ModifierPractice{
	public static void main(String[] args){
		Coordinates a = new Coordinates(0,0,15);
		System.out.println("Set point a at ("+ a.getX()+", "+a.getY()+"), and the static variable a.t equals "+a.getTest());
		Coordinates b = new Coordinates(4,5,6);
		System.out.println("Set point b at ("+ b.getX()+", "+b.getY()+"), and the static variable b.t equals "+b.getTest());
		System.out.println("After setting b, a.t equals "+a.getTest());
		System.out.printf("The distance between two point is %.4f \n",a.calculateDistance(b));
		a.setTest(15);
		System.out.println("After set a.test to 15, b.test equals "+b.getTest());
	}	


}

class Coordinates{

 	public Coordinates(){
 		x_ = 0;
 		y_ = 0;
 		test_ = 0;
 	}

 	public Coordinates(int x, int y, int t){x_=x;y_=y;test_ = t;}

 	public void setX(int x){x_ = x;}

 	public void setY(int y){y_ = y;}

 	public void setTest(int t){test_ = t;}

 	public int getX(){return x_;}

 	public int getY(){return y_;}

 	public static int getTest(){return test_;}

 	public double calculateDistance(Coordinates o){
 		double d = Math.sqrt(Math.pow(x_ - o.getX(),2)+Math.pow(y_ - o.getY(),2));
 		return d;
 	}

	private int x_;
	private int y_;

	private static int test_;
}
