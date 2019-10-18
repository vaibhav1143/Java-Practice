package JavaPractice;

import java.util.regex.*;
public class Test1 {

	public static void main(String[] args) {

		Pattern p= Pattern.compile(".s");
		Matcher m= p.matcher("as");
		boolean b=m.matches();
		
		boolean b1=Pattern.compile("..s").matcher("has").matches();
		System.out.println(b1);
		System.out.println(Pattern.matches("..d", "and"));
		System.out.println(b);
	}

}
