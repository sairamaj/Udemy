class Person{
	String name;
	int    age;
}

class Application{
	public static void main(String[] args){
		Person p1  = new Person();
		p1.name = "sai";
		p1.age = 50;

		System.out.println(p1.name + ":" + p1.age);

		Person p2 = new Person();
		p2.name = "Sourabh";
		p2.age = 15;

		System.out.println(p2.name + ":" + p2.age);
		
	}
}