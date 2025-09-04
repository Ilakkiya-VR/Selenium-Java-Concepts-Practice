package AbstractN;

public abstract class Page {
	public Page(){System.out.println("page default const");}
	//public Page(int a){System.out.println("page one const"+a);}
	public Page(int a,int b){System.out.println("page two const"+a+b);}
	public abstract void title();
	public abstract void url();
	private void logoele() {System.out.println("check logo");}
	public final void displayLogo() {
		System.out.println("page logo");
		logoele();
	}
	public void defaultTime() {
		System.out.println("page default time 10s");
	}
	public static void displayFooter() {
		System.out.println("page Footer");
	}
	
	
}

