package SuperKey_This;

public class BMW extends Car {
	//int speed=400;
	public BMW() {
		this("Hello","Car");
		System.out.println("BMW Car=====default const");}
	public BMW(String S) {
		super(100);
		System.out.println("BMW Car=====one param const"+S);}
	public BMW(String S,String T) {
		super(100,200);
		System.out.println("BMW Car=====two param const"+S+T);}
public void getFinalSpeed() {
		int carspeed=super.speed;
		System.out.println("BWC Car Speed:"+speed);
		System.out.println("Car Speed:"+ carspeed);
		System.out.println("Final Car Speed:"+ (carspeed+speed));
		
	}
public void stop() {System.out.println("BMW Car Stop Method");
super.stop();}

}
