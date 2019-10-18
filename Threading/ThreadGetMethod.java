package thread;
public class ThreadGetMethod extends Thread {
	public void run() {
		
		System.out.println("running");
		System.out.println("name is : "+getName());
		System.out.println("id is : "+getId());
		System.out.println();
	}

	public static void main(String[] args) {
	
		ThreadGetMethod tm,tr,tg;
		tm=new ThreadGetMethod();
		tr=new ThreadGetMethod();
		tg=new ThreadGetMethod();
		tm.start();
		tr.start();
		tg.start();
		 tm.setName("vaibhav");
		 System.out.println("NEW NAME IS "+tm.getName());
	}

}
