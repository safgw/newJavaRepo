package string;

public class StringPalindrome {

	public static void main(String[] args) 
	{
		StringBuffer word1 = new StringBuffer("java");
		String dupWord1 = word1.toString();
		StringBuffer word2 = new StringBuffer("malayalam");
		String dupWord2 = word2.toString();
		System.out.println(word1);
		System.out.println(word2);
		String word11 = word1.reverse().toString();
		String word22 = word2.reverse().toString();
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word11);
		System.out.println(word22);

		if(word1.toString().equals(word11))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		if(dupWord2.equals(word22))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		/*
		if(word2.equals(s2))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		*/

	}

}
