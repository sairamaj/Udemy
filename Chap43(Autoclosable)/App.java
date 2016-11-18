class Temp implements AutoCloseable{
	public void close(){
		System.out.println("closing.");
	}
}
public class App{
	public static void main(String[] args){
		try( Temp t = new Temp()){
			System.out.println("in try (new).");
		}
	}
}