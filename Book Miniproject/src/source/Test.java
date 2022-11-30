package source;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		BookFunction bf=new BookFunction();
		Scanner sc=new Scanner(System.in);
		
		
	while(true) {
		
		bf.index();
	
		int index=sc.nextInt();
		
		switch (index) {
		case 1:
			bf.AddBook();
			
			break;
		case 2:
			bf.update();
			break;
		case 3:
			bf.delete();
			break;
		case 4:
			bf.search();
			break;
		case 5:
			bf.Getall();
			break;
		case 6:
			
			System.out.println("Thank you...");
			System.exit(0);

		default:
			System.out.println("Please Enter valid Option");
			break;
		}
	}
	}

}
