package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable{
  

	private String message;
	public ThreadPool(String s) {
	this.message=s;
		}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Messages"+message);
		processmassage();
		System.out.println(Thread.currentThread().getName()+" (End)");	
		}
		private void  processmassage(){ 
		try {Thread.sleep(200);}catch(Exception e) {System.out.println(e);}
		
	}
	
	
}


class Threadpool1{
	
	public static void main(String[] args) {
		ExecutorService ex=Executors.newFixedThreadPool(5);
		for(int i=0;i<=5;i++) {
			Runnable worker=new ThreadPool(""+i);
			ex.execute(worker);
		}
		ex.shutdown();
		while(!ex.isTerminated()) {}
		System.out.println("Finished");
		
		
		
		
		
	}

}
