package thread;

public class TheadPriority extends Thread {

	public void run() {
		
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		System.out.println("Thread Priority is "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {

		TheadPriority tp,tp1; 
		tp=new TheadPriority();
		tp1=new TheadPriority();
		tp.setPriority(MIN_PRIORITY);
		tp1.setPriority(MAX_PRIORITY);
	tp.start();
	tp1.start();
	
	}

}
