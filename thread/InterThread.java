
class Bank{
	int amount=5000;
	synchronized void widtdraw(int amount) {
		System.out.println("Going to widtdraw");
		if(	this.amount<amount) {
			System.out.println("low balence in your account is "+this.amount);
		try {wait();}catch(Exception e) {}
				}
		this.amount-=amount;
		System.out.println("Widhdraw Completed "+amount);
	
		System.out.println("Remaining balence is "+this.amount);
		}


	synchronized void deposite(int amount) {
		System.out.println("going to deposit");
	this.amount+=amount;
	System.out.println("deposit completed "+amount);
	notify();
	
	}
}

public class InterThread {
	public static void main(String[] args) {
		final Bank b=new Bank();
		new Thread(){
			public void run() {
				b.widtdraw(15000);
			}
			}.start();
			
		new Thread() {
			public void run() {
				b.deposite(20000);}
			}.start();
			}
		
	}


