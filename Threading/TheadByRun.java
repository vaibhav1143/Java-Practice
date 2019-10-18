package thread;
 
public class TheadByRun extends Thread {
	public void run() {
		for(int i=0;i<=10;i++) {
			try{Thread.sleep(500);}
			catch(Exception e) {System.out.println(e);}
		System.out.println(i);
		}
	}

	public static void main(String[] args) {

		TheadByRun tr=new TheadByRun();
		TheadByRun tr1=new TheadByRun();
		
		tr1.start();
		tr1.run();
		tr.start();
		tr.run();
	}

}
