import java.util.*;

class Machine{
	public String toString(){
		return "I am machine";
	}
}

class Camera extends Machine{
	public String toString(){
		return "I am camera";
	}
}

public class App{
	public static void main(String[] args){
		ArrayList<Machine> list = new ArrayList<Machine>();
		list.add(new Machine());
		list.add(new Machine());
	
		show(list);	
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());		
		list2.add(new Camera());
		show(list2);
	}

	static void show(ArrayList<? extends Machine> list){
		for(Machine m: list){
			System.out.println(m);
		}
	}
}