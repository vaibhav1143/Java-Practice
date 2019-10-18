package JavaPractice;

class Anonymous{
	void data() {
		System.out.println("Anonymous Inner Class");
	}
	
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Anonymous an=new Anonymous();
		an.data();
		Anonymous ano=new Anonymous() {
			void data() {System.out.println("Another method of Anonymous Inner Class ");}
		};
		ano.data();
	}

}
