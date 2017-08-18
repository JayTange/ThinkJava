package cp14;

public class C{

	public static A makeB(){
		return new B();
	}
}

class B implements A{
	@Override
	public void f() {
		System.out.println("public C.f()");
	}

	void u(){
		System.out.println("package c.u()");
	}
	
	protected void w(){
		System.out.println("protected C.w()");
	}
}