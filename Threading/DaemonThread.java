package thread;

public class DaemonThread extends Thread {

	public  void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Daemon Thread"+Thread.currentThread().isDaemon());
	}
	
	public static void main(String[] args) {

		DaemonThread dt=new DaemonThread();
		
		dt.setName("vaibhav");
		dt.start();
	}

}
