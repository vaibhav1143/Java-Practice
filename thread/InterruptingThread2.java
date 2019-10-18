
public class InterruptingThread2 extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		}catch(InterruptedException e) {
			System.out.println("Interrupt error is : "+e);
		}
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
 
		InterruptingThread2 it2=new InterruptingThread2();
	it2.start();
	it2.interrupt();
	}

}
