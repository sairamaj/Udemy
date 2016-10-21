class Robot{
	void speak(String msg){
		System.out.println(msg);
	}
}

public class Application{
	public static void main(String[] args){
		Robot r = new Robot();
		r.speak("hai");
	}
}