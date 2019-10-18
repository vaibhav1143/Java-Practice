package JavaPractice;

public class LocalInnerClass {

	void display() {
		
		class LocalClass{
			
			void msg() {
				System.out.println("this is local inner class example");
			}
		}
	LocalClass lc=new LocalClass();
	lc.msg();
	
	}
	
	
	public static void main(String[] args) {

		LocalInnerClass lic=new LocalInnerClass();
		lic.display();
		
	}

}
