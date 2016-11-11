class Plant
{
	public void grow(){
		System.out.println("Plant grow");
	}
}

class Tree extends Plant
{
	public void grow(){
		System.out.println("Tree grow");
	}
}

public class App{
	public static void main(String[] args){
		Plant p = new Plant();
		doGrow(p);
		
		Tree tree = new Tree();
		doGrow(tree);			
	}

	static void doGrow(Plant plant){
		plant.grow();
	}
}