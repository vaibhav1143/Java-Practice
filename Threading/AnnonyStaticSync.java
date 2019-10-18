package thread;

class AnnonyStatic{
	synchronized static void Test(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		try {Thread.sleep(100);}catch(Exception e) {}
		}
	}
}
public class AnnonyStaticSync {
	public static void main(String[] args) {

		AnnonyStatic as=new AnnonyStatic();
		
		Thread t1=new Thread() {
			public void run() {
				as.Test(1);
			} 
		};
		Thread t2=new Thread() {
			public void run() {
				as.Test(10);
			}
		};
		Thread t3=new Thread() {
			public void run() {
				as.Test(100);
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
	}

}
