package thread;


public class SimpleThread extends Thread{

public void run(){
	 System.out.println("this is simple thread program");
 }

	public static void main(String[] args) {

		SimpleThread td=new SimpleThread();
		td.start();
	}

}
