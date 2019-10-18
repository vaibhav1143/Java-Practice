package JavaPractice;

class Demo{
	void show() {
		System.out.println("demo inner class");
	}
}
public class InnerDemo {
	static Demo d1=new Demo() {
	void show() {
		super.show();
		System.out.println("anothor inner");
	}
	};
	
	public static void main(String[] args) {

		d1.show();
	}

}
