/*
	Modifier	class	package		sub	world
	public		Y	Y		Y	Y
	private		Y	N		N	N
	protected	Y	Y		Y	N
	no modifier	Y	Y		Y	N
*/
class Plant{
	private String name;
	public int height;
	protected String type;	
public Plant(){
		name = "plant";	// can access here.
	}
	
}

class Oak extends Plant{	
	public Oak(){
		type = "oak";
	}
}

public class App{
	public static void main(String[] args){
		Plant p = new Plant();

		// private cannot be accessed outside class.
//		System.out.println(p.name);

		// public can be accessed
		p.height =100;

		Oak o = new Oak();
	}
}