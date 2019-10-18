package thread;

class Sync{	public void synctest(int n) {
synchronized(this) {
	for(int i=1;i<=5;i++) {
		System.out.println(n*i);
		try {Thread.sleep(200);}
		catch(Exception e) {System.out.println(e);}
	}
}

}
}

class  Sync1 extends Thread{
	Sync s;
	Sync1(Sync s){
		this.s=s;
	}
	public void run() {
		s.synctest(10);
	}
}
class Sync2 extends Thread{
	Sync s;
	Sync2(Sync s){
		this.s=s;
		
	}
	public void run() {
		
		s.synctest(100);
	}
	
}


public class SyncBlock {
		public static void main(String[] args) {
	Sync s=new Sync();
	Sync1 s1=new Sync1(s);
	Sync2 s2=new Sync2(s);
	
	
	s1.start();
	s2.start();		
			
	}

}
