package InputOutput;

public class memorytest {

	public static void main(String[] args) 
	{
	 Runtime r=Runtime.getRuntime();
	 System.out.println("total memory="+r.totalMemory());
	 System.out.println("free memory="+r.freeMemory());
	 for(int i=1;i<10000;i++)
	 {
		 new memorytest();
	 }
		System.out.println("new memory ="+r.freeMemory()); 
		r.gc();
		System.out.println("after gc memory="+r.freeMemory());
	}

}
