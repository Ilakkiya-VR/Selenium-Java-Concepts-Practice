package InheritAndOverride;

public class car extends Vehicle{
	int Price;
	public int start(int Price) {
	    this.Price=Price;
		System.out.println("Car-------Start method");
		System.out.println("Car Start Method Price");
		return Price;
	}
	public void stop() {
		System.out.println("Car-------Stop method");
	}
	
	public void fuel() {
		System.out.println("Car-------Fuel method");
	}

	public static void engine() {System.out.println("Car----new Vehicle Engine Method");}
	
	private void restart() {System.out.println("Car----Restart Method");}
	
	public void restart1() {
	restart();
	}
	
	
	
	
	
	

}
