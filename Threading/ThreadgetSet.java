package thread;

public class ThreadgetSet extends Thread {

	public void run() {
		
		System.out.println(getName());
	}
	
	public static void main(String[] args) {

		ThreadgetSet ts=new ThreadgetSet();
		
		
		
		ts.start();
		ts.setName("vaibhav");
		
		
	}

}
