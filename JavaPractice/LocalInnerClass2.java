package JavaPractice;

public class LocalInnerClass2 {

	private  int data=30;
	void local() {
		
		class InnerClass{
			void msg() {System.out.println(data);}
		}
		InnerClass lc=new InnerClass();
		lc.msg();
	}
	
	
	public static void main(String[] args) {

		LocalInnerClass2 lic2=new LocalInnerClass2();
		lic2.local();
	}

}
