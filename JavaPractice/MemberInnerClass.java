package JavaPractice;

public class MemberInnerClass {

	private int data=10;
	class InnerClass{
		void Class() {
			System.out.println(data);
		}
		
	}
	
	public static void main(String[] args) {

//MemberInnerClass  mi=new MemberInnerClass();
MemberInnerClass.InnerClass in=new MemberInnerClass().new InnerClass(); 
in.Class();
		
	}

}
