public class Car extends Machine{

	public Car(){
		name = "toyota";
	}

	@Override
	public void start(){
		System.out.println("starting car...");
		super.start();
	}

	public void show(){
		System.out.println("car name:" + name);
	}
}