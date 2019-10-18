
public class InterruptThread extends Thread{

	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		}catch(InterruptedException e) {
//			System.out.println("Exception is "+e);
					
		throw new RuntimeException(e);
		}
		
	}
	public static void main(String[] args) {
 
		InterruptThread it=new InterruptThread();
		it.start();
		try {
			it.interrupt();
			}
		catch(Exception e) 
		{System.out.println(e);}
		
	}

}
