import java.io.*;

class Person implements Serializable{
	
	String name;
	int age;

	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class App{
	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException{
		Person p = new Person("sai",50);
		try( FileOutputStream fs = new FileOutputStream("person.bin")){
			try(ObjectOutputStream os = new ObjectOutputStream(fs)){
				os.writeObject(p);
			}
		}

		try( FileInputStream fr = new FileInputStream("person.bin") ){
			try( ObjectInputStream oin = new ObjectInputStream(fr)){
				Person p2 = (Person)oin.readObject();
				System.out.println(p2.name);
				System.out.println(p2.age);
			}
		}
		
	}	
}