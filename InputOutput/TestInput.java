package InputOutput;
import java.io.*;
public class TestInput {

	public static void main(String[] args) {
		try {
			FileInputStream input1=new  FileInputStream("D:\\testin.txt");
			FileInputStream input2=new FileInputStream("D:\\testout.txt");
			FileOutputStream Fout=new FileOutputStream("D:\\Demo.txt");
			SequenceInputStream sis=new SequenceInputStream(input1, input2);
			int i;
			while((i=sis.read())!=-1) {
				Fout.write(i);
			}
			input1.close();
			input2.close();
			Fout.close();
			sis.close();
			System.out.println("success");
		}catch(Exception e){System.out.println(e);}

	}

}
