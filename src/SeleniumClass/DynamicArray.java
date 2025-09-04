package SeleniumClass;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		ArrayList AR=new ArrayList();
		AR.add("Ilakkiya");
		AR.add(35);
		AR.add("CTS");
		AR.add("US Project");
		AR.add("Location:Los Vegas");
		AR.add("1012");
		System.out.println(AR.size());
		System.out.println(AR.get(0));
		int i=0;
		while(i<AR.size()) 
		{System.out.println(AR.get(i));i++;}
		System.out.println("----------------");
		int j=0;
		do
		{System.out.println(AR.get(j));
		j++;}
		while(j<AR.size());
		System.out.println(AR.remove(1));
		System.out.println(AR.remove(4));
		System.out.println("----------------");
		for(Object S:AR) {System.out.println(S);}
		System.out.println("----------------");
		ArrayList<String> Lib=new ArrayList<String>();
		Lib.add("Fifty Shades of Grey");
		Lib.add("Fifty Shades Freed");
		Lib.add("Fifty Shades Darker");
		Lib.add("Harry Potter");
		Lib.add("Law of Attraction");
		System.out.println("Booklist:");
		System.out.println("----------------");
		for (String Books:Lib) {
			System.out.println(Books);
			}
		System.out.println("Booklist:");
		System.out.println(Lib.size());
		if(Lib.isEmpty()) {System.out.println("Book is not found");}
		Lib.set(0,"Fifty Shades of Grey");
		Lib.set(1,"Fifty Shades Freed");
		Lib.set(2,"Fifty Shades Darker");
		Lib.set(3,"Harry Potter");
		Lib.set(4,"Harry Potter-Vol1");
		for (String Books:Lib) {
			System.out.println(Books);
			}
		}
	
	

	}


