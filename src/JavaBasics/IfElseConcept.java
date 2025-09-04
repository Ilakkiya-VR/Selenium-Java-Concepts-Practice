package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		int i = 500;
		int j = 600;
		int k = 700;
		int l = 400;
		if(i<j & i<k & i<l) {
				
 System.out.println("i is the least number");
	}
		else if(j<k & j<l) {System.out.println("j is the least number");
		
		}
		else if (k<l) {System.out.println("k is the least number");
		
		}
		else {System.out.println("l is the least number");
		}
		int a = 20;
		int b = 20;
		if(a!=b) { System.out.println("a and b are not equal");
		}
		else {System.out.println("a and b are equal:"+a);
		}
	}
}
