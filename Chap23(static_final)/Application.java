class Thing
{
  public static final int LUCKY_NUMBER=7;
  static int counter;
  int id;
  public Thing(){
	id = counter;
	counter++;
  }

  public void show(){
	System.out.println("thing id is:" + id);
  }	
}

class Application{
	public static void main(String[] args){
		System.out.println(Thing.LUCKY_NUMBER);
		Thing t1 = new Thing();
		Thing t2 = new Thing();
		t1.show();
		t2.show();
	}
}