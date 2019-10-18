package thread;

public class ThreadOverLoading extends Thread {
 	int a,b,c,d,e;
public ThreadOverLoading(int a,int b) {
	this.a=a;
	this.b=b;
	
	}
public ThreadOverLoading(int a,int b,int c) {
	this.a=a;
	this.b=b;
	this.c=c;
	 e=a+b+c;
	}
	
	public void run() {
		d=a+b;
		System.out.println("addition of 2 int is : "+d );
		System.out.println("addition of 3 int is : "+e);
	 }
	
	
		public static void main(String[] args) {
 
		ThreadOverLoading to=new ThreadOverLoading(14,10,60);
 
 new Thread(to).start();
 
		
	}


	 
}
