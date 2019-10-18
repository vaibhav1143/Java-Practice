package thread;

public class ThreadSleepMethod extends Thread {
	public void run(){
		for(int i=10;i>0;i--){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		System.out.println(i);
		}
	}
	public static void main(String[] args) {

		ThreadSleepMethod ts=new ThreadSleepMethod();
		ts.start();
	}

}
