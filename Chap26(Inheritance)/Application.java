public class Application{
	public static void main(String[] args){
		System.out.println("Main");
		Machine m1 = new Machine();
		m1.start();
		m1.stop();
		
		Car c1 = new Car();
		c1.start();
		c1.stop();
		c1.show();
		System.out.println("I can access protected from here to(because in the same package):" + c1.name);
	}
}