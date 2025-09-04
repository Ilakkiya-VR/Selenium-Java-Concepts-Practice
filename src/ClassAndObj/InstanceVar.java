package ClassAndObj;

public class InstanceVar {
	
String name;
int age;
String qualification;
String designation;
String location;
static String Company="CTS";

	public static void main(String[] args) {
		InstanceVar emp=new InstanceVar();
		emp.name="Ilakkiya";
		emp.age=21;
		emp.qualification="B.TECH MBA";
		emp.location="Chennai";
		InstanceVar emp1=new InstanceVar();
		emp1.name="Bala";
		emp1.age=21;
		emp1.qualification="BE";
		emp1.location="Bangalore";
		InstanceVar emp2=new InstanceVar();
		emp2.name="Aarudhran";
		emp2.age=20;
		emp2.qualification="MS";
		emp2.location="Bangalore";
		InstanceVar emp3=new InstanceVar();
		emp3.name="Adidev";
		emp3.age=20;
		emp3.qualification="B.TECH MBA";
		emp3.location="Chennai";
		InstanceVar employees[]= {emp,emp1,emp2,emp3};
		for(InstanceVar e:employees) 
		{System.out.println("Name:"+e.name+" Age:"+e.age+" Qualification:"+e.qualification+" Location:"+e.location+" Company:"+InstanceVar.Company);
		if(e.location.trim().equalsIgnoreCase("Chennai")) {System.out.println("The following employees belong to Chennai location: "+ e.name);
		}
		else {System.out.println("The following employees belong to Bangalore; location: "+ e.name);}
		}
		
		}	
}
