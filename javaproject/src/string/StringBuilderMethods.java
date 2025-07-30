package string;

public class StringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s1 = new StringBuilder("Hello");
		
		//Method1 append()   - Possible to append only in the end. Similar to concat
		s1.append(" World");
		System.out.println(s1);
		//System.out.println(s1.append(" World")); //Another way to do this in a single line
		
		//Method2 insert() - Possible to insert in between
		s1.insert(5, " Java"); // index+1
		System.out.println(s1);
		
		
		//Method3 replace()
		s1.replace(0, 5, "Hi");  //give start and end+1 indices (eg:Hello)
		System.out.println(s1);
		
		//Method4 delete() 
		s1.delete(0, 3);  //give start and end+1 indices (eg:"Hi ")
		System.out.println(s1);
		
		
		//Method5 capacity()  - 
		StringBuilder s2 = new StringBuilder(""); // An empty string is created now
		System.out.println(s2.capacity()); //16 is the default value of empty string
		System.out.println(s1.capacity()); //Current value of s1= "Java World". 'capacity' Considers default+initial assigned value length("Hello") = 16+5 =21
		System.out.println(s1.length()); //Considers length of current value ("Java World") = 10
		
				/*
				 Output till now:
				 Hi Java World
				Java World
				16
				21
				10
				 */
		
		
		//Method6 charAt()
		System.out.println(s1.charAt(5)); // output - W
		
		
		//Method7 substring()
		System.out.println(s1.substring(5)); // o/p = World
		System.out.println(s1.substring(0,2)); //o/p = Ja
		System.out.println(s1); //o/p - Java World
		
		
		//Method8 reverse()
		System.out.println(s1.reverse()); // o/p = dlroW avaJ
		System.out.println(s1.reverse()); //o/p = Java World
	}

}
