package SeleniumClass;

import java.util.ArrayList;

public class ArrayAssign {

	public static void main(String[] args) {
		int empID[]=new int[5];
		empID[0] = 123;
		empID[1] = 234;
		empID[2] = 345;
		empID[3] = 456;
		empID[4] = 567;
		int search=789;
		boolean found=false;
		System.out.println("No of Employees:"+empID.length);
		System.out.println("Employees ID:");
		for(int id:empID) {
			System.out.println(id);
			if (id==search) {
			found = true;
			}
		}
		System.out.println("--------");
			if(found) {System.out.println(search+"Employees ID exists");}
			else {
				System.out.println(search+"Employees ID not exists");
				}
			System.out.println("--------");
			String dep[]= {"HR","IT","Finance"};
			String dept= "HR";
			System.out.println("Employee Department:");
			for(String dn:dep) {System.out.println(dn);}
			System.out.println("Enter the department name:"+ dept);
			ArrayList<String> empName=new ArrayList<String>();
			empName.add("Adidev IPS");
			empName.add("DR Aarudhran");
			empName.add("Bala");
			empName.add("Murugan");
			empName.add("Ilakkiya");
			empName.add("Sindhu");
			System.out.println("Employee Name List");
			for(String nl:empName) {System.out.println(nl);}
			empName.remove((String)"Sindhu");
			System.out.println("\nUpdated Employee List:");
			for(String nl:empName) {System.out.println("-"+nl);}
			//11. Write a Java program to create a new array list,add some colors (string) and print out the collection
			

					}
	
	}


