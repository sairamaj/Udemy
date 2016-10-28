class Frog{
	String name;
	int age;

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}

class Application{
	public static void main(String[] args){
		Frog f = new Frog();
		f.setName("bettie");
		System.out.println(f.getName());
	}
}