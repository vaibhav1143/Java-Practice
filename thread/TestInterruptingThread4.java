
public class TestInterruptingThread4 extends Thread {

	public void run() {
		for(int i=1;i<=2;i++)
		{
			if(Thread.interrupted()) {
				System.out.println("code is interrupted");
			}else {
				System.out.println("code is normal");
			}
		}
	}
	public static void main(String[] args) {
 
		TestInterruptingThread4 t4=new TestInterruptingThread4();
		TestInterruptingThread4 t5=new TestInterruptingThread4();
		t4.start();
		t4.interrupt();
		t5.start();
	}

}
