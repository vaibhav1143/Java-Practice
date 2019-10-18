package thread;

public class ThreadbyRunInterface implements   Runnable  {
	public void run() {
		for(int j=0;j<=5;j++) {
			try {Thread.sleep(500);}catch(Exception e) {
				System.out.println(e);
			}
		System.out.println(j);
		}
	}


	public static void main(String[] args) {

		ThreadbyRunInterface ti=new ThreadbyRunInterface();
	
		Thread t=new Thread(ti);
		t.run();
		t.start();
		t.run();
	}

}
