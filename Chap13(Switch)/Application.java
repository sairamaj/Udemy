import java.util.*;

class Application{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		switch(text){
			case "apple":	
				System.out.println("Apple");
				break;	
			case "bananan": 
				System.out.println("Banana");
				break;
			default:
				System.out.println("not found");
		}		
	}
}