package thread;

class Test1 extends Thread{
	public void run() {
		System.out.println(" thread example");
	}
	
}



public class ThreadTest1  {

	public static void main(String[] args) {

Test1 t1=new Test1();
t1.start();
		
	}

}
