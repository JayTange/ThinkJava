package cp4;

public class Leaf {

	private int i=0;
	Leaf increment(){
		i++;
		return this;
	}
	void print(){
		System.out.println("i= "+i);
	}
	public static void main(String args[]){
		 Leaf a = new Leaf();
		 a.increment().increment().increment().print();
	}
}
