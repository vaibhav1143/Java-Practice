package thread;

public class ThreadPriority1 extends Thread {

	public void run() {
		
		for(int i=0;i<=5;i++) 
		{
			try{Thread.sleep(200);}
				catch(Exception e) {
					System.out.println(e);
				}
				
		System.out.println(Thread.currentThread().MAX_PRIORITY);
		System.out.println(i);
		System.out.println();
		}
//		for(int j=6;j<=10;j++) {
//			try{Thread.sleep(200);}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//			
//	System.out.print(Thread.currentThread().MIN_PRIORITY);
//	System.out.println(j);
//	System.out.println();
//		}
		}
		
		
	
	public static void main(String[] args) {

		ThreadPriority1 tp1=new ThreadPriority1();
//		tp1.setPriority(MAX_PRIORITY);
		tp1.start();
		
	}

}
