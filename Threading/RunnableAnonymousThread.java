package thread;

public class RunnableAnonymousThread {

	public static void main(String[] args) {

		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("this is runnable thread 1");
			}
		};
		Thread t1=new Thread(r1); 
		Runnable r2=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("this is runnable thread 2");
				
			}
		};
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
		
		
	}

}
