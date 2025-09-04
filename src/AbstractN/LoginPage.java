package AbstractN;

public class LoginPage extends Page{
	
	public LoginPage(){System.out.println("Loginpage default const");}
	public LoginPage(int a){System.out.println("Loginpage one const"+a);}
	public LoginPage(int a,int b){System.out.println("Loginpage two const"+a+b);}

	@Override
	public void title() {
		System.out.println(" LP----title");
		
	}

	@Override
	public void url() {
		System.out.println(" LP-----url");
		
	}

	public void defaultTime() {
		System.out.println(" LP-----page default time 20s");
	}
	public void doLogin(String un, String pwd) {
		System.out.println("enter username " + un);
		System.out.println("enter password " + pwd);
		System.out.println("click on login button");
		System.out.println("user is logged in");
	}
	
	public static void displayFooter() {
		System.out.println("LP=====page Footer");
	}
	
}
