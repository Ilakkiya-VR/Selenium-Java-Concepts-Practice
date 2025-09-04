package ClassAndObj;

public class Method {
	String HotDrink;
	String Type;
	int Amount;
	
	public void SelectHotDrink() {
		int Price=0;
		int GST=0;
		System.out.println("Select Hot Drink:"+ HotDrink);
		switch(HotDrink) {
		case "Tea":
			Price=25;
			GST=2;
			Amount=Price+GST;
			{System.out.println("Enter the choice of Tea:"+ Type);
			if (Type.equals("Strong")) {System.out.println("Strong Tea: Price:"+Price);
			System.out.println("GST:"+ GST);
			System.out.println(" Amount with GST:"+ Amount);
			}
			else
				Price=20;
				Amount=Price+GST;
			System.out.println("Medium Tea: Price:"+Price);
			System.out.println("GST:"+ GST);
			System.out.println("Amount with GST:"+ Amount);
			}
			break;
		
	case "Coffee":
		Price=30;
		GST=3;
		Amount=Price+GST;
		{System.out.println("Enter the choice of Coffee:"+ Type);
		if (Type.equals("Strong")) 
		{System.out.println("Strong Coffee: Price:"+Price);
		System.out.println("GST:"+ GST);
		System.out.println("Amount with GST:"+ Amount);
		}
		else
			Price=27;
			Amount=Price+GST;
		System.out.println("Medium Coffee: Price:"+Price);
		System.out.println("GST:"+ GST);
		System.out.println("Amount with GST:"+ Amount);
		}

	}
	
} 
	
	public void snacks(String S) {
		int price=10;
		System.out.println("10Rs Snacks:"+ S+ ":"+price);
		int total=Amount+price;
		System.out.println("Total Amount to be paid:"+total);
		
	}
	public static void purchasePdt(Method obj) {
		System.out.println("Purchased Items");
		obj.SelectHotDrink();
		obj.snacks("Lays");
		
	}

	public static void main(String[] args) {
		Method obj=new Method();
		obj.HotDrink="Coffee";
		obj.Type="Medium";
		Method.purchasePdt(obj);
		
	
	
	}

}
