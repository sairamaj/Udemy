class Person{
	String name;
	int    age;

	void speak(){
		System.out.println("my name is:" + name);
	}

	int getAge(){
		return this.age;	
	}
}

class Application{
	public static void main(String[] args){
		Person p1  = new Person();
		p1.name = "sai";
		p1.age = 50;

		System.out.println(p1.getAge());		
	}
}