interface Info{
	void show();
}

class Person implements Info{
	String name;
	public Person(String name){
		this.name = name;
	}
	public void show(){
		System.out.println("Person:" + this.name);
	}
}

class Machine implements Info{
	int id;
	public Machine(int id){
		this.id = id;
	}
	
	public void show(){
		System.out.println("Machine:" + this.id);
	}
}

public class Application{
	public static void main(String[] args){
		Machine m1 = new Machine(100);
		Person p1 = new Person("sai");
		showInfo(m1);
		showInfo(p1);
	}

	static void showInfo(Info info){
		info.show();
	}
}