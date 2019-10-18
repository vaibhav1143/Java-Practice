
public class DeadLock {

	public static void main(String[] args) {
		 String resorce="vaibhav";
		 String resorce1="thakare";
	
	Thread t1=new Thread(){
		public void run() {
		synchronized(resorce) {
			System.out.println("deadlock object 1 process 1");
			try {
				Thread.sleep(4000);
			}catch(Exception e) {
				System.out.println(e);
			}
			synchronized (resorce1) {
				System.out.println("deadlock  object 2 process 2");
			}
		
		}
	}	
	};	
	
	Thread t2=new Thread() {
		public void run() {
			synchronized (resorce1) {
			System.out.println("deadlock object 2 process 1");
				try {
					Thread.sleep(4000);
				}catch(Exception e) {
					System.out.println(e);
							}
		synchronized (resorce) {
		
			System.out.println("deadlock object 2 process 2");
		}
			}
		}
	};
	
	t1.start();
	t2.start();
	}

}
