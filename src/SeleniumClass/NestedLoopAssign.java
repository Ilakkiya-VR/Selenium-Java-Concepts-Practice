package SeleniumClass;

public class NestedLoopAssign {

	public static void main(String[] args) {
	for(int i=0;i<=10;i++)
	{for (int j=0;j<=10;j++) {
		System.out.print("("+i+","+j+")\t");
	}
	System.out.println();
	}
	String S[]=new String[3];
	S[0]="New";
	S[1]="Old";
	S[2]="oldNew";
	for(int a=0;a<S.length;a++) {
		for(int b=0;b<S.length;b++) {
			//System.out.print("("+S[a]+","+S[b]+")\t");
			System.out.println(S[a]);
			System.out.println(S[b]);
			
	}
		System.out.println();
	}
	}

}
