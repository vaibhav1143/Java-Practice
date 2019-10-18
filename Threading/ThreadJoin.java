package thread;

public class ThreadJoin  extends Thread {
	public void run() {
		for(int i=0;i<=15;i++) {
			try{Thread.sleep(100);}
			catch(Exception e)
			{
				System.out.println(e);
			}
		System.out.println(i);	
		}
	}

	public static void main(String[] args) {
 
		ThreadJoin tj,tj1,tj2;
		tj=new ThreadJoin();
		tj1=new ThreadJoin();
		
		tj2=new ThreadJoin();
		
		
		tj.start();
		try {
		tj.join(150);}
		catch(Exception e) {System.out.println(e);}
		System.out.println();
		tj1.start();
//		try {
//			tj1.join();}
//			catch(Exception e) {System.out.println(e);}
//			System.out.println();
		tj2.start();
	}

}
