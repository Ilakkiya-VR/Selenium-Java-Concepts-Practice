package BuilderPattern;

public class Shopping {
	int orderid;
	public Shopping login() {
		System.out.println("login into the appln");
		return this;}
	public Shopping login(String un, String pwd) {
		System.out.println("login into credential"+un+pwd);	
		return this;}
    public Shopping search(String prd) {
    	System.out.println("search the produts"+prd);
    	return this;}
    public Shopping search(String prd, int price) {
    	System.out.println("search the produts"+prd+price);
    	return this;}
    public Shopping order() {
    	orderid=2346;
    	System.out.println("Order id generated"+orderid);
    	return this;}
    public Shopping payment(String pm) {
    	System.out.println("Payments"+pm);
    	return this;}
    public Shopping logout() {System.out.println("logged out");
    return this;}
    public void trackingid() {
    	System.out.println("Tracking order id"+orderid);
    }
    
	}


