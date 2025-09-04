package ClassAndObj;

public class ClassCon {

	//Employee Category
	String name;
	int age;
	String city;
	String designation;
	
	public static void main(String[] args) {
		ClassCon emp=new ClassCon();
		emp.name="Ilakkiya";
		emp.age=21;
		emp.city="Los Vegas";
		emp.designation="TM";
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.city);
		System.out.println(emp.designation);
		System.out.println("------------------");
		ClassCon emp1=new ClassCon();
		emp1.name="Adiev";
		emp1.age=21;
		emp1.city="Los Vegas";
		emp1.designation="TL";
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		System.out.println(emp1.city);
		System.out.println(emp1.designation);
		System.out.println("------------------");
		ClassCon emp2=new ClassCon();
		emp2.name="Aarudhran";
		emp2.age=21;
		emp2.city="Seattle";
		emp2.designation="Software Engineer";
		System.out.println(emp2.name);
		System.out.println(emp2.age);
		System.out.println(emp2.city);
		System.out.println(emp2.designation);
		System.out.println("------------------");
		ClassCon emp3=new ClassCon();
		emp3.name="Bala";
		emp3.age=25;
		emp3.city="Newyork";
		emp3.designation="Manager";
		System.out.println(emp3.name);
		System.out.println(emp3.age);
		System.out.println(emp3.city);
		System.out.println(emp3.designation);
		System.out.println("------------------");
		//emp=emp2;
		System.out.println(emp.name);
		System.out.println(emp1.name);
		System.out.println(emp2.name);
		System.out.println(emp3.name);
		System.out.println("------------------");
		//emp2=emp1=emp3;
		System.out.println(emp.name);
		System.out.println(emp1.name);
		System.out.println(emp2.name);
		System.out.println(emp3.name);
		ClassCon employess[]= {emp,emp1,emp2,emp3};
		for(ClassCon e:employess) {if(e.city.equals("Newyork"))
		{System.out.println(e.name+" :This employee belongs to "+e.city);
			}
		}
		
		
	}

}
