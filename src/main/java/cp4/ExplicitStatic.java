package cp4;

public class ExplicitStatic {

//	static Cups x = new Cups();
//	static Cups y = new Cups();
	public static void main(String[] args) {
		System.err.println("in main");
		Cups.cup1.f(99);
	}

}
class Cup{
	public Cup(int maker) {
		System.out.println("cup("+maker+")");
	}
	void f(int maker){
		System.out.println("f("+maker+")");
	}
}
class Cups{
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	public Cups() {
		System.out.println("Cups()");
	}
}