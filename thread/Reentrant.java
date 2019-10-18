
public class Reentrant {

	public synchronized void m() {
		n();
		System.out.println("you called sync m");
	}
	 public synchronized void n() {
		 System.out.println("you call sync n");
	 }
}
