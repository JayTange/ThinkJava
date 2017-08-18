package cp15;

public class Holder3<T> {
	private T a;
	public Holder3(T a){
		this.a = a;
	}
	
	public T get(){
		return a;
	}
	public static void main(String ages[]){
		Holder3<Integer> h3 = new Holder3<Integer>(new Integer(4));
		Integer a = h3.get();
		System.out.println(a);
	}
}
