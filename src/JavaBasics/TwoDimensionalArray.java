package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
	String x[][] = new String[4][3];
	x[0][0] = "A";
	x[0][1] = "B";
	x[0][2] = "C";
	x[1][0] = "A";
	x[1][1] = "B";
	x[1][2] = "C";
	x[2][0] = "A";
	x[2][1] = "B";
	x[2][2] = "C";
	x[3][0] = "A";
	x[3][1] = "B";
	x[3][2] = "C";
	
	System.out.println(x.length);
	System.out.println(x[0].length);

	 for(int row=0; row<x.length;row++) {
	 for(int col=0; col<x[0].length;col++)
	 
		 System.out.println(x[row][col]);
	 }
	}
}

