package InputOutput;

public class memorytest2 {

	public static void main(String[] args)
	{
		Runtime r=Runtime.getRuntime();
		System.out.println("TOTAL MEMORY="+r.totalMemory());
		System.out.println("freememory="+r.freeMemory());
		
		for(int i=0;i<100000;i++)
		{
			new memorytest2();
		}
		System.out.println("new memory="+r.freeMemory());
		r.gc();
		System.out.println("after gc memory="+r.freeMemory());
	}

}
