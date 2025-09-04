package JavaBasics;

public class TwoDimenReal {

	public static void main(String[] args) {
		
		 int marks[][] = {
				   {85, 90, 78}, // Student 1
		            {88, 76, 92},// Student 2
		          {80, 85, 88}, // Student 3
		          {80, 85, 88}, // Student 4
		 };
		 String subjects[] = {"Math", "Science", "English"};
		 for (int row=0; row<marks.length; row++)
		 {System.out.println("Student "+(row+1)+ " Marks:");
		 for(int col=0;col<marks[row].length;col++)
		 {System.out.println(subjects[col]+":"+marks[row][col]);
		 }
		 }

	}

}
