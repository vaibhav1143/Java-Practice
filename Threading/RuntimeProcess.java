package thread;

public class RuntimeProcess {

	public static void main(String[] args) {
		 
		Runtime r=Runtime.getRuntime();
		System.gc();
		System.out.println("Available Process is : "+r.availableProcessors());
		

	}

}
