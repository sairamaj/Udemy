class Machine{
	String name;
	int code;

	public Machine(){
		this("machine1",0);
	}

	public 	Machine(String name){
		this(name,0);
	}

	public Machine(String name, int code){
		this.name = name;
		this.code = code;
	}
}
class Application{
	public static void main(String[] args){

		Machine m1 = new Machine();
		Machine m2 = new Machine("machine2");
		Machine m3 = new Machine("machine3", 100);

		System.out.println(m1.name + ":" + m1.code);
		System.out.println(m2.name + ":" + m2.code);
		System.out.println(m3.name + ":" + m3.code);
	}
}