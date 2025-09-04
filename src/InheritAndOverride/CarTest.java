package InheritAndOverride;

public class CarTest {

	public static void main(String[] args) {
		Bmw bm=new Bmw();
		bm.start(10000);
		//System.out.println(bm.Price);
		bm.fuel();
		bm.autoparking();
		Bmw.engine();
		
		System.out.println("---------------");
		car c=new car();
		c.start(20000);
		System.out.println(c.Price);
		car.engine();
		c.restart1();
		System.out.println("---------------");
		car c1=new Bmw();
		c1.start(100);
		c1.stop();
		c1.fuel();
		car.engine();
		Vehicle.engine();
		
		

	}

}
