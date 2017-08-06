package cp8;

public class Shapes {

	private static RandomShapeGenertor gen = new RandomShapeGenertor();
	
	public static void main(String args[]){
		Shape[] s = new Shape[9];
		for(int i =0;i<s.length;i++){
			s[i] = gen.next();
		}
		for(Shape sha : s){
			sha.draw();
		}
	}
}
