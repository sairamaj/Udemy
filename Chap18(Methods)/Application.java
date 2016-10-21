class Person{
	String name;
	int    age;

	void speak(){
		System.out.println("my name is:" + name);
	}
}

class Application{
	public static void main(String[] args){
		Person p1  = new Person();
		p1.name = "sai";
		p1.age = 50;

		System.out.println(p1.name + ":" + p1.age);
		p1.speak();

		Person p2 = new Person();
		p2.name = "Sourabh";
		p2.age = 15;

		System.out.println(p2.name + ":" + p2.age);
		p2.speak();		
	}
}