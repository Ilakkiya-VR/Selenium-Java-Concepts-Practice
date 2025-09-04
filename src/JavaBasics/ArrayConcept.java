package JavaBasics;
public class ArrayConcept {

	public static void main(String[] args) {
		int i[] = new int[6];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		i[5] = 60;
		
//System.out.println(i[4]);
//At the time, we can store multiple value of the same data type
//Static array: Disadv:SIze is fixed//overcome this problem- dynamic array
//we can store only similar data type value//overcome this - object array

for(int j=0;j<i.length;j++) {System.out.println(i[j]);
	
	}
char c[] = new char[2];
c[0] = 'Y';
c[1] = 'N';

for(int k=0;k<c.length;k++) {System.out.println(c[k]);
	}
String s[] = new String[2];
s[0] = "Be Positive";
s[1] = "Always Happy";
{
System.out.println(s[1]);	
}
double e[] = new double[3];
e[0] = 12.33;
e[1] = 1;
e[2] = 10.01;
System.out.println(e[2]+e[1]);
}
}