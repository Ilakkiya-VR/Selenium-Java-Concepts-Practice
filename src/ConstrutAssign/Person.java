package ConstrutAssign;

public class Person {
	String name;
	int age;
	char gender;
	double height;
	
	public Person(String name, int age, char gender,double height){
		this. name=name;
		this.age =age;
		this.gender=gender;
		this.height=height;
		
	}

	public static void main(String[] args) {
	
Person P1=new Person("Bala",25,'M',5.6);
Person P2=new Person("Ilakkiya",23,'F',5.5);
System.out.println(P1.name+","+P1.age+","+P1.gender+","+P1.height);
System.out.println(P2.name+","+P2.age+","+P2.gender+","+P2.height);

	}

}
/*
 * What is the purpose of a constructor in Java?
 * to initialise the instance variables with proper input values.there is a chance of creating an object without providing proper inputs.
 * This will help to prevent the number of object creation without input values. This will occupy the memory even Garbage collector not able to destruct the object as it has a proper object reference.
 * How does a constructor differ from a regular method in Java?
 * constructor helps to initialise the instance variables whereas method has business logic. based on input values, methods process the data and return the output.
 * Can a Java class have multiple constructors? If so, how are they
 * differentiated?
 * yes. we have multiple constructors. Based on parameters, constructors can be differentiated.
 * What happens if a constructor is not defined in a Java class?
 * there is a chance of creating object without providing proper input values.
 * Can a constructor call other methods or constructors within the same class?
 * yes we can call the methods but we have to use the constructor for the purpose of initialising the instance variables. Methods have business logic, it can return the values whereas constructor can't return the value. therefore we can keep constructor to initialise the instance variables.
 */