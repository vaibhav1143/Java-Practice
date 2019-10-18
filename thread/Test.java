
public class Test {

	public static void main(String[] args) {
 
	final	Test t=new Test();
		Thread t1=new Thread() {
			public void run() {
				t.m();
			}
		};
	t1.start();
	}

}
