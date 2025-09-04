package SeleniumClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ArrayListAssign {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Blue");
		color.add("Black");
		color.add("Purple");
		color.add("Pink");
		color.add("White");
		for(String e:color) {System.out.println(e);}
		color.add(0,"Green");
		color.add(6,"Red");
		System.out.println("------------------");
		for(String e:color) {System.out.println(e);}
		System.out.println("------------------");
		System.out.println(color.get(4));
		System.out.println(color.get(2));
		color.set(3,"Blue");
		color.set(4,"Black");
		System.out.println(color.get(4));
		System.out.println(color.get(3));
		System.out.println("------------------");
		for(String e:color) {System.out.println(e);}
		System.out.println("------------------");
		List<String> list =color.subList(3,6);
		System.out.println(list);
		color.remove("Green");
		for(String e:color) {System.out.println(e);}
		if(color.contains("Red")) 
		{System.out.println("Red is available");}
		else {System.out.println("Red is not available");}
		System.out.println("------------------");
		System.out.println(color.size());
		System.out.println("------------------");
		for(int i=color.size()-1;i>0;i--) {
		System.out.println(color.get(i));}
		
		
	}

}
