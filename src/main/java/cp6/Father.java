package cp6;

public abstract class Father {

	private void print(){
		System.out.println("this is private");
	}
	
	abstract void p();
	
	public void play(){
		System.out.println("paly");
	}
	static void tune(Father iFather){
		iFather.play();
	}
	
	void say(){
		System.out.println("pakage");
		p();
	}
}
