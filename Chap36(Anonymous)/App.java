class Machine
{
	public void start(){
		System.out.println("Machine start.");
	}
}

interface IPlant{
	public void grow();
}


public class App{
	public static void main(String[] args){
		Machine m = new Machine(){
			@Override public void start(){
				System.out.println("Mahine start overriden");
			}
		};

		m.start();

		IPlant oak = new IPlant(){
			public void grow(){
				System.out.println("oak growing.");
			}
		};

		growPlant(oak);
	}


	static void growPlant(IPlant plant){
		plant.grow();
	}
}