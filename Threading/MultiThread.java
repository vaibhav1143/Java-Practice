package thread;

class Thread1 extends Thread{
	public void run() {System.out.println("this is thread 1");}
}

class Thread2 extends Thread{
	public void run() {
		System.out.println("this is thread 2");
	}
}

public class MultiThread {

	public static void main(String[] args) {
	 Thread1  t1=new Thread1();
	 Thread2  t2=new Thread2();
	 t1.start();
	 
	 t2.start();

	}

}
