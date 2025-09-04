package AbstractN;

public class LPTest {

	public static void main(String[] args) {
	LoginPage lp=new LoginPage(10);
	lp.title();
	lp.displayLogo();
	lp.url();
	lp.defaultTime();
	lp.doLogin("Ilakkiya", "pass12");
	LoginPage.displayFooter();
	Page.displayFooter();
	System.out.println("-------------");
	Page P= new LoginPage();
	P.displayLogo();
	P.defaultTime();
	P.url();
	P.title();
	P.displayFooter();

	}

}
