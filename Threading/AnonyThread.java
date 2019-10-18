package thread;

public class AnonyThread   {

	public static void main(String[] args) {
 
Thread t1=new Thread() {
public void run() {
			System.out.println("Anonymus thread 1");
			
		}
		 
		
	};

	Thread t2=new Thread() {
	public void run() {
		System.out.println("Anonymus thread 2");
			}
	};
	
	t1.start();
	t2.start();
}
}