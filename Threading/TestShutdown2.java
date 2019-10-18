package thread;

public class TestShutdown2 {
	public static void main( String args[])throws  Exception {
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new Thread() {
		
	
	public void run() {
		System.out.println("shutdown hook completed");
	}
		}
				);
System.out.println("thread shutting down");
	try {Thread.sleep(3000);}catch(Exception e) {}
	}
}

