class Machine{
	public void start(){
		System.out.println("machine start.");
	}
}

class Camera extends Machine{
	public void start(){
		System.out.println("camera start.");
	}
	
	public void snap(){
		System.out.println("camera snap");
	}
}

public class App{
	public static void main(String[] args){
		Machine m1 = new Machine();
		Camera c1 = new Camera();

		m1.start();
		c1.start();
		c1.snap();

		// upcasting
		Machine m2 = c1;
		m2.start();

		// downcasting
		Camera c2 = (Camera)m2;
		c2.snap();

	}
}