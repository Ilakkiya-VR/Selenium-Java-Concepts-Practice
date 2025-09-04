package Interface_OOP;

public interface WHO {
	int MIN_VAC_FEE=200;
	public void vaccination();
	private void vac() {
		System.out.println("private");
	}
default void newvac() {vac();}
}
