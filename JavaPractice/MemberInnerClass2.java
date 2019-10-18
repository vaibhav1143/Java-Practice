package JavaPractice;

public class MemberInnerClass2 {
	
	 private int a=10,b=20;
class InnerTest{
	
	
	void data() {
	
		  int c=0;
		c=a+b;
		System.out.println(c);
	}
	
}
	
	

	public static void main(String[] args) {

MemberInnerClass2.InnerTest mi=new MemberInnerClass2().new InnerTest();

 

mi.data();
		
		
	}

}
