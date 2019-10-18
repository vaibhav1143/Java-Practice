
public class InterruptingThread3 extends Thread {
public void run() {
	for(int i=0;i<=5;i++)
		System.out.println(i);
}
	public static void main(String[] args) {

		InterruptingThread3 it3=new InterruptingThread3();
		it3.start();
		it3.interrupt();
		
	}

}
