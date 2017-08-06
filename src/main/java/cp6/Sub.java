package cp6;

public class Sub extends Father{

	public static void main(String args[]){
		Sub x = new Sub();
		x.say();
	}

	@Override
	void p() {
		Sub s= new Sub();
		System.out.println("¼¯³É");
		s.tune(s);
	}
}
