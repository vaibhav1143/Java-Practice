package thread;
class StaticMethod{
	synchronized static void Test(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
			try {Thread.sleep(200);}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class Method1 extends Thread{
	StaticMethod sm;
	Method1(StaticMethod sm){
		this.sm=sm;
		}
	public void run() {sm.Test(1);}
}
class Method2 extends Thread{
	StaticMethod sm;
	Method2(StaticMethod sm){
		this.sm=sm;
		
	}
	public void run() {sm.Test(10);}
}

class Method3 extends Thread{
	StaticMethod sm;
	public Method3(StaticMethod sm) {

		this.sm=sm;
			}
	public void run(){sm.Test(100);}
}
public class StaticSync {

	public static void main(String[] args) {
 
		StaticMethod sm=new StaticMethod();
		Method1 m1=new Method1(sm);
		Method2 m2=new Method2(sm);
		Method3 m3=new Method3(sm);
		m1.start();
		m2.start();
		m3.start();
	}

}
