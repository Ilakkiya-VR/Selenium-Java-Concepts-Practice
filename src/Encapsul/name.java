package Encapsul;

public class name {
	public String org;
	private String name;
	private int age;
	private double salary;
	
	public name(String org,String name,int age,double salary) {
		this.org=org;
		this.name=name;
		this.age=age;
		{
		if(age>=18) {
			this.age=age;}
	
			else {		
		System.out.println("user age is not eligible");
		}
		}
		this.salary=salary;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;}
	public void finalsal() {
		System.out.println("Name:"+ this.getName());
		System.out.println("Organisation:"+ this.getOrg());
		System.out.println("Age:"+ this.getAge());
		System.out.println("Salary without bonus:"+this.getSalary());
		System.out.println("Final Salary Details");
		salcal();

	}


	private void salcal(){
		if(age<18) {
			System.out.println("user is not eligible for salary");
		}
		else if(age==18||age<=45) {
			this.salary= this.salary+10000.50;
			System.out.println(this.salary);
		}
		else if(age>=46||age>=80) {
			this.salary= this.salary+20000.50;
			System.out.println(this.salary);
		}
		else {System.out.println("salary is not applicable");}
	
	}
	

	public static void main(String[] args) {
	name nm= new name("TCS","Ilakkiya",46,24000.33);
	nm.finalsal();
	
	}

}