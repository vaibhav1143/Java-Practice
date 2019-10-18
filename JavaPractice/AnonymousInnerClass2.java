package JavaPractice;

interface InterfacessAnonymousInnerClass{
	void Interfaceinner();
}


public class AnonymousInnerClass2 {

	public static void main(String[] args) {
InterfacessAnonymousInnerClass inter=new InterfacessAnonymousInnerClass() {
	
	@Override
	public void Interfaceinner() {
		 System.out.println("Interface Anonymous Inner Class");
	}
}; 
		inter.Interfaceinner();
	}

}
