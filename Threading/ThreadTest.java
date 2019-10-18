package thread;

public class ThreadTest extends Thread {
	 public void run(){
		System.out.println("this is a thread..");
	}

	public static void main(String[] args) {
		ThreadTest tt=new ThreadTest();
		tt.start();
	}

}
