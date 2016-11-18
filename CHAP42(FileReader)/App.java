import java.io.*;
import java.util.*;

public  class App{
	public static void main(String[] args) throws FileNotFoundException{

		File file = new File("test.txt");
		Scanner scanner = new Scanner(file);		

		String line = scanner.next();
		System.out.println(line);	
	}
}