package InputOutput;
import java.io.*;
public class SequenceInput {

	public static void main(String[] args) throws Exception {
		FileInputStream fin1=new FileInputStream("D:\\testout.txt");
		FileInputStream fin2=new FileInputStream("D:\\testin.txt");
		SequenceInputStream inpstream=new SequenceInputStream(fin1, fin2);
		int j;
		while((j=inpstream.read())!=-1) {
			System.out.print((char)j);
		}
		inpstream.close();
		fin1.close();
		fin2.close();
	}

}
