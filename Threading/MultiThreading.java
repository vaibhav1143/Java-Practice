package thread;

public class MultiThreading extends Thread {

	int id;
	String name;
	public MultiThreading(int i, String string) {

		id=i;
		name=string;
	
	}
	public void run() {		
	
		System.out.println(" id is : "+id+" name is : "+name);
	}
	
		public static void main(String[] args) {
		
		MultiThreading mt =new MultiThreading(101,"vaibhav");
		
		new Thread(mt).start();
		

	}

}
