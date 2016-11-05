class Frog{
	String name;
	Frog(String name){
		this.name = name;
	}
	
	public String toString(){
		return String.format("Frog_%s", this.name);
	}
}

public class Application{
	public static void main(String[] args){
		Frog f1 = new Frog("Fredy");
		System.out.println(f1.toString());
	}
}