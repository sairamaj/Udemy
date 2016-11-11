import java.util.*;

public class App{
	public static void main(String[] args){
		 ArrayList<String> list = new ArrayList<String>();
		list.add("one");	
		list.add("two");
		
		System.out.println(list.get(1));

		for(String s : list){
			System.out.println(s);
		}
	}
}