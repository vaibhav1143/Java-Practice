package thread;

class StaticAnnonyBlock{
	synchronized static void test(int n) {
		synchronized (StaticAnnonyBlock.class) {
			for(int i=0;i<=10;i++) {
				System.out.println(n*i);
			}
		}
	}
}
public class StaitcBlock {

	public static void main(String[] args) {
 
		StaticAnnonyBlock sb=new StaticAnnonyBlock();
		Thread t1=new Thread() {
			public void run() {
				sb.test(10);
			}
		};

		Thread t2=new Thread() {
			public void run() {
				sb.test(100);
			}
		};
		t1.start();
		t2.start();
	}

}
