package InputOutput;

import java.io.*;
import java.util.*;
public class MultiInput {

	public static void main(String[] args) throws Exception{

		FileInputStream fin1=new FileInputStream("D:\\Vaibhav\\A.txt");
		FileInputStream fin2=new FileInputStream("D:\\Vaibhav\\B.txt");
		FileInputStream fin3=new FileInputStream("D:\\Vaibhav\\C.txt");
		FileInputStream fin4=new FileInputStream("D:\\Vaibhav\\D.txt");
		
		Vector v=new Vector();
			v.add(fin1);
			v.add(fin2);
			v.add(fin3);
			v.add(fin4);
		
		Enumeration e=v.elements();
		SequenceInputStream input = new SequenceInputStream(e);
		int i;
		while((i=input.read())!=-1) {
			System.out.print((char)i);
		}
		
//		input.close();
//		fin1.close();
//		fin2.close();
//		fin3.close();
//		fin4.close();
	}

}
