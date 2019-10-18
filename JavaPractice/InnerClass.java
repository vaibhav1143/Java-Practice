package JavaPractice;

public class InnerClass {
	class Inner{
		void inner() {
			System.out.println("this is simple inner class programe");
		}
	
	}

	public static void main(String[] args) {


		InnerClass.Inner obj=new InnerClass().new Inner();
		obj.inner();
	
	}

}
