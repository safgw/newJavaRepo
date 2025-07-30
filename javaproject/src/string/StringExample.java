package string;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello";
		String s1 = "Hello"; // s and s1 are the same
		
		String s2 = new String("Hello");
		String s3 = new String("Hello");// s1 and s2 are different objects 
		System.out.println(s==s1);  // == Compares variables/object memories
		System.out.println(s2==s3); //  == Compares variables/object memories
		System.out.println(s==s2);// == Compares variables/object memories
		System.out.println(s.equals(s3)); // .equals compares the values of variables. Also this is case sensitive.
		
		

	}

}

/*
Output:
true
false
false
true


*/