import java.util.Scanner;

class Application{
	public static void main(String[] args){
		System.out.println("Enter input.");
		
		Scanner input = new Scanner(System.in);
		int val = input.nextInt();
		System.out.println("Input is:" + val);
	}
}