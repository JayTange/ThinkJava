package cp12;

public class InheritingExceptions {

	public void f() throws SimpleException{
		System.out.println("throw SimpleException from f()");
		throw new SimpleException();
	}
	
	public static void main(String[] args) {
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch (SimpleException e) {
			e.printStackTrace(System.err);
		}
	}

}

class SimpleException extends Exception{
	private static final long serialVersionUID = 1L;}