package thread;

class Annony{
	public void AnnonyTest(int  n) {
		synchronized (this) {
			for(int i=0;i<=5;i++) {
				System.out.println(n*i);
				try {Thread.sleep(200);}
				catch(Exception e) {System.out.println(e);}
			}
		}
	}
}


public class AnonnySyncBlock {

	public static void main(String[] args) {

Annony a=new Annony();
Thread t1=new Thread() {
	public void run() {
		a.AnnonyTest(100);
	}
};

Thread t2=new Thread() {
	public void run() {
		a.AnnonyTest(1000);
	}
};

t1.start();
t2.start();
	}

}
