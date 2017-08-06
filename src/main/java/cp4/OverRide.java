package cp4;

public class OverRide {

	public OverRide(int i){
		System.out.println(i);
	}
	
	public void say(){
		System.out.println("hello");
	}
	public void say(String s){
		System.out.println(s);
	}
	public static void main(String args[]){
		OverRide r = new OverRide(3);
		r.say();
		r.say("NO");
	}
}
