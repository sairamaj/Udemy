enum Animal{
	CAT("catee"),DOG("dogee"),MOUSE("mouseee");

	String name;
	Animal(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}

public class App{
	public static void main(String[] args){
		Animal a = Animal.CAT;	
		System.out.println(a.name());
		if( a == Animal.CAT){
			System.out.println("this is cat");
		}
	}
}