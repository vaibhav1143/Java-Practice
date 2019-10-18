package thread;

public class GarbageCollection {

	public void finalize() {System.out.println("GB thread ");}
	public static void main(String[] args) {

		GarbageCollection gc1=new GarbageCollection();
		GarbageCollection gc2=new GarbageCollection();
		gc2=null;
		gc1=null;
		System.gc();
	}

}
