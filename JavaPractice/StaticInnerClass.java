package JavaPractice;

public class StaticInnerClass {
	
	static int data=50;
	static void inner() {
		 class StaticInner{
			void staticclass() {
				System.out.println("data is "+data);
			}
		}
		StaticInner si=new StaticInner();
		si.staticclass();
	}
	

	public static void main(String[] args) {

		StaticInnerClass sic=new StaticInnerClass();
		sic.inner();
	}

}
