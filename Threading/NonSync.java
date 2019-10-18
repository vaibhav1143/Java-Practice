package thread;

class Thread12  {
	void test(int n) {
		for(int i=0;i<=5;i++ ) {
			System.out.println(n*i);
			try {Thread.sleep(200);}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
	}
	
}
class MyThread extends Thread{
	
Thread12 t1;
MyThread(Thread12 t1){
	this.t1=t1;
}
public void run() {
	t1.test(5);
}
}

class MyThread2 extends Thread{
Thread12 t2;
public MyThread2(Thread12 t2) {
	
	this.t2=t2;
}
public void run() {
	t2.test(100);
}
 }


public class NonSync {

	public static void main(String[] args) {

		Thread12 t12=new Thread12();
		MyThread my1=new MyThread(t12);
		MyThread2 my2= new MyThread2(t12);
		my1.start();
		my2.start();
	}

}
