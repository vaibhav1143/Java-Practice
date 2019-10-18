package thread;

public class ThreadShutDown extends Thread {
	public void run() {
		System.out.println("thread shutdown ");
	}

	public static void main(String[] args) throws   Exception 	{

//		ThreadShutDown ts=new ThreadShutDown();
		Runtime r=Runtime.getRuntime(); 
		r.addShutdownHook(new ThreadShutDown());
		System.out.println("now main sleeping  ");
//	try{Thread.sleep(1000);}catch(Exception e) {}
	}

}
