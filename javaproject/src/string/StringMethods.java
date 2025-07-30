package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java Program";
		
		
		//Method1: length()
		System.out.println(s.length());
		
		
		//Method2: charAt()  - character at given index position
		System.out.println(s.charAt(5));
		
		
		//Method3: valueOf() // Converts diff data types to String
		int a = 10;
		String b = String.valueOf(a);
		System.out.println(b);
		
		
		//Method4: equals()
		System.out.println(s.equals("Java")); // FAILS IF THE Case is different
		
		
		//Method5: equalsIgnoreCase()
		System.out.println(s.equalsIgnoreCase("jAVA pROGRAM"));
	
		
		//Method6: isEmpty()
		String s1 = "";
		System.out.println(s1.isEmpty());
		System.out.println(s.isEmpty());
		
		
		//Method7: toLowerCase()
		System.out.println(s.toLowerCase());
		
		
		//Method8: toUpperCase()
		System.out.println(s.toUpperCase());
		
		
		//Method9: contains()
		System.out.println(s.contains("Java")); // This is case sensitive
	
		//Method10: concat() /To join 2 strings
		String s2 = " Excercise";
		System.out.println(s.concat(s2));
		
		
	}
	
	
}
