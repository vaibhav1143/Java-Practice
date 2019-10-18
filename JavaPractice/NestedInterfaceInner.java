package JavaPractice;


interface Inner1{
	void show();
	interface Inner2{
		void msg();
	}
	}

public class NestedInterfaceInner implements Inner1.Inner2{
public void show() {System.out.print("hello ");}
public void msg() {System.out.print("world");}
	

	
	public static void main(String[] args) {

//		Inner1.Inner2 ni=new NestedInterfaceInner();
		NestedInterfaceInner ni=new NestedInterfaceInner();
		ni.show();
		ni.msg();
		
	}

}
