package JavaBasics;

public class ObjectArray {

	public static void main(String[] args) {
		Object ab[] = new Object[6];
		ab[0] = "Ilakkiya";
		ab[1] = 1010;
		ab[2] = "10 Dec";
		ab[3] = 5.6;
		ab[4] = "B. Tech MBA";
		ab[5] = "TCS";
		 Object cd[] = new Object[2];
	     cd[0] = "Ilakkiya";
	     cd[1] = "TCS";
		System.out.println("Name of the employee:"+ab[0]);
		System.out.println("ID Number:"+ab[1]);
		System.out.println("DOB:"+ab[2]);
		System.out.println("Height:"+ab[3]);
		System.out.println("Qualification:"+ab[4]);
		System.out.println("Company Name:"+ab[5]);
		System.out.println("*****************");
		for (int l=0; l<ab.length;l++)
		{
		System.out.println(ab[l]);
		
	}
	if(ab[0]!= cd[0]) {System.out.println("Employee is working in TCS");
	}
	else {System.out.println("Employee is not working in TCS");
}
	}
}
