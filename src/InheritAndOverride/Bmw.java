package InheritAndOverride;

public class Bmw extends car {
	int Price;
	@Override
	public int start(int Price) {
		this.Price=Price;
		System.out.println("BMW Car-------Start method");
		System.out.println("BMW Car------- New Start method and its price");
		return Price;
	}
	public void autoparking() {System.out.println("BMW Car-------Auto Parking method");}
	public static void engine() {System.out.println("BMW----Vehicle Engine Method");}

}
