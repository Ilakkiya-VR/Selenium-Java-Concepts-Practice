package ClassAndObj;

public class B {
	String name;
	String dob;
	String place;
	int age;
	
public B(String name, String dob) {
	
		this.name = name;
		this.dob = dob;
	}

	public B(String name, String dob, String place, int age) {
	super();
	this.name = name;
	this.dob = dob;
	this.place = place;
	this.age = age;
}



	public static void main(String[] args) {
		System.out.println("Constructor template");
		B P1= new B("Naveen","1313");
		System.out.println(P1.name+","+P1.dob);
		
		
	}

}
