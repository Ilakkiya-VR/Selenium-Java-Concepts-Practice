package SeleniumClass;

public class TwoDim {

	public static void main(String[] args) {
		String N[][]= {
				{"Adi","Aaru","Bala","Murugan"},
				{"one","two","three","four"},
				{"Super","Spider","New","old"},
				{"SuperN","SpiderN","NewN","oldN"},
		};
		System.out.println(N.length);
		for(int i=0;i<N.length;i++) {
			for(int j=0;j<N.length;j++) { 
			System.out.print(N[i][j]+" ");
		}
		System.out.println();
		}
		System.out.println(N[0][1]);
		for(String[] e:N) {
			for(String f:e) {
			System.out.print(f+" ");}
			System.out.println();
	}
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=9;j++) 
			{System.out.print(i+""+j+"\t");
		}
		System.out.println();
		}
}
}