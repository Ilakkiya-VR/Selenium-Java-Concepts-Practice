package BuilderPattern;

public class ShopTest {

	public static void main(String[] args) {
		Shopping s=new Shopping();
		s.login();
		s.search("iphone");
		s.search("iphone", 25000);
		s.order();
		s.logout();
		System.out.println("=================");
		s.login().
		        search("car").
		                      order().
		                              payment("upi").
		                                           logout();
		System.out.println("=================");
		s.logout();
		System.out.println("=================");
		s.login("ilakkiya", "gjhghk").search("bike").logout();
		System.out.println("=================");
		s.payment("upi").logout();
		System.out.println("=================");
		s.trackingid();
		        
        
		        
		                   

	}

}