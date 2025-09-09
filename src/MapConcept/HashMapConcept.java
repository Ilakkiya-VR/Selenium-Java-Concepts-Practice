package MapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapConcept {

	public static void main(String[] args) {
		
	//key-value pair
		//name: Aaru
		//age: 3
		
		//HashMap does not maintain the insertion data order and it allows duplicate keys but it fetch the latest value of the duplicate key. 
		//and also it allows null key. null key is present at the top in the o/p 
		
		
	HashMap<String, Object> studentdetail = new HashMap<String, Object> ();
	studentdetail.put("name", "Aaru");
	studentdetail.put("age", 3);
	studentdetail.put("class", "Playgroup");
	studentdetail.put("Presence",true);
	
	System.out.println(studentdetail);
	
	String StudentName= (String)studentdetail.get("name");
	System.out.println(StudentName);
	int StudentAge= (Integer)studentdetail.get("age");
	System.out.println(StudentAge);
	String Stdclass= (String)studentdetail.get("class");
	System.out.println(Stdclass);
	boolean stdPresence=(Boolean)studentdetail.get("Presence");
	System.out.println(stdPresence);
	
	HashMap<String, Integer> studentMark=new HashMap<String,Integer>();
	studentMark.put("Bala",90);
	studentMark.put("BalaMurugan",80);
	studentMark.put("Bala",100);
	studentMark.put("Aaru",100);
	studentMark.put("Adidev",90);
	studentMark.put("Adidev",100);
	studentMark.put("Bala",80);
	studentMark.put(null,50);
	studentMark.put("Ilakkiya",null);
	studentMark.put(null,20);
	studentMark.put("Bala",null);
	System.out.println(studentMark);
	System.out.println(studentMark.get("Bala"));
	System.out.println(studentMark.get("Aaru"));
	System.out.println(studentMark.get("Adidev"));
	System.out.println(studentMark.get("BalaMurugan"));
	System.out.println(studentMark.get("Ilakkiya"));
	System.out.println(studentMark.get(null));
	
	HashMap<String, Double> teacherSal=new HashMap<String,Double>();
	teacherSal.put("Bala",80000.00);
	teacherSal.put("Aaru",180000.00);
	teacherSal.put("Adidev",200000.00);
	teacherSal.put("Ilakkiya",null);
	teacherSal.put(null,20.00);
	teacherSal.put("Bala",700.00);
	teacherSal.put("BALA",7000.00);
	System.out.println(teacherSal);
	System.out.println(teacherSal.get("BALA"));
	System.out.println(teacherSal.get("Bala"));
	System.out.println(teacherSal.get("Aaru"));
	System.out.println(teacherSal.get("Adidev"));
	System.out.println(teacherSal.get("BalaMurugan"));
	System.out.println(teacherSal.get("Ilakkiya"));
	System.out.println(teacherSal.get(null));
	
	//LinkedHashMap maintains the insertion data order and it allows duplicate keys but it fetch the latest value of the duplicate key. 
	//and also it allows null key. 
	LinkedHashMap<String, Integer> studentMarks=new LinkedHashMap<String,Integer>();
	studentMarks.put("Bala",90);
	studentMarks.put("BalaMurugan",80);
	studentMarks.put("Bala",100);
	studentMarks.put("Aaru",100);
	studentMarks.put("Adidev",90);
	studentMarks.put("Adidev",100);
	studentMarks.put("Bala",80);
	studentMarks.put(null,50);
	studentMarks.put("Ilakkiya",null);
	studentMarks.put(null,20);
	studentMarks.put("Bala",null);
	System.out.println(studentMarks);
	
	//TreeMap maintains the order based on key and it allows duplicate keys but it fetch the latest value of the duplicate key. 
	//and also it should not allow null key. 
	TreeMap<String, Integer> stdtMarks=new TreeMap<String,Integer>();
	stdtMarks.put("Bala",90);
	stdtMarks.put("BalaMurugan",80);
	stdtMarks.put("Bala",100);
	stdtMarks.put("Aaru",100);
	stdtMarks.put("Adidev",90);
	stdtMarks.put("Adidev",100);
	stdtMarks.put("Bala",80);
	stdtMarks.put("Ilakkiya",null);
	stdtMarks.put("Bala",null);
	stdtMarks.remove(stdtMarks);
	System.out.println(stdtMarks);
	
	System.out.println("************************************");
	Map<String, Integer> data =new TreeMap<String,Integer>();
    data=new LinkedHashMap<String, Integer>();
    data=new HashMap<String, Integer>();
    data.put("Ilakkiya", 20000);
    data.put("Sindhu", 35000);
    data.put("Aaru", 30000);
    data.put("Adi", 90000);
    data.put("Dev",60000);
    data.put("Bala", 20000);
    System.out.println(data);
	}
	
	

}
