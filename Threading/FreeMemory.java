package thread;

public class FreeMemory {

	public static void main(String[] args) {
	 
		Runtime r=Runtime.getRuntime();
		System.out.println("Free memory is : "+r.freeMemory());
		System.out.println("Total Memory is  : "+r.totalMemory());
		long Used_memory;
		
		Used_memory=r.totalMemory()-r.freeMemory();
		System.out.println();
		System.gc();
		System.out.println("Used memory is: "+Used_memory);
		
	}

}
