package Interface_OOP;

public interface USMedical extends WHO {
	public void orthoServices();
	public void cardioServices();
	default void USMethod() {System.out.println("US Method");}
	public static void USStatic() {System.out.println("USStatic Method");}
	

}