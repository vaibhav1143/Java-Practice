package thread;

public class ThreadTest2  implements Runnable{
	 	public void run(){
		System.out.println("this is runaable example");
	}
	
	
	public static void main(String[] args) {
 
		ThreadTest2 test=new ThreadTest2();
		Thread t=new Thread(test);
		t.start();
	}

}
