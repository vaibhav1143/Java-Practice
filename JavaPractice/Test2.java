package JavaPractice;


import java.util.regex.*;

public class Test2 {

	public static void main(String[] args) {

		System.out.println(Pattern.matches("[abc]", "d"));//only get abc 
		System.out.println(Pattern.matches("[^abc]", "e"));//except abc support other
		System.out.println(Pattern.matches("[a-zA-Z]", "x"));//get all char small or capital 
		System.out.println(Pattern.matches("[a-p[x-z]]", "u"));//only a-p and x-z get
		System.out.println(Pattern.matches("[a-z&&[def]]", "f"));//supprt only def 
		System.out.println(Pattern.matches("[a-z&&[^bc]]", "b"));//support all char except bc
		System.out.println(Pattern.matches("[a-z&&[^q-u]]", "f"));//supprt all char except q-u
		
		
		//quantifiers 
		System.out.println();
		System.out.println("quantifiers ");
		System.out.println();
		
		System.out.println(Pattern.matches("[abc]?", "a"));//? quantifiers  char onece or not
		System.out.println(Pattern.matches("[a-z]?", "dd"));
		
		
		System.out.println(Pattern.matches("[abc]+", "aa"));// + quantifiers find char onece or more 
		System.out.println(Pattern.matches("[a-z]*", "")); // * quantifiers  find char 0 or more time
		
		System.out.println(Pattern.matches("[a-z]{2}", "i"));// {n} quantifiers find char n time else it false
		System.out.println(Pattern.matches("[a-d]{2,}", "aaaa")); //{n,} quantifiers find char n or more time else it false
		System.out.println(Pattern.matches("[a-z]{3,5}", "sss"));////{n,m} quantifiers find char n to m time else it false
		
		
		System.out.println();
		System.out.println("Regex Metacharacters");
		System.out.println();
		
		System.out.println(Pattern.matches(".s", "as"));//  . any char
		System.out.println(Pattern.matches("\\d", "1"));//  \\d support only digit
		System.out.println(Pattern.matches("\\D", "4"));// \\D not support digit
		System.out.println(Pattern.matches("\\s", " "));// \\s Any whitespace character
		System.out.println(Pattern.matches("\\S", "s"));// \\S Any  non whitespace character
		
		
		
	}

}
