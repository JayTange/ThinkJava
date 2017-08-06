package cp4;
/**
 * 构造器定义顺序
 * @author 唐杰
 *
 */
public class OrderInit {

	public static void main(String[] args) {
		Card card = new Card();
		card.f();
		System.gc();
	}

}
/**
 * 因此， t3 句柄会被初始化两次，一次在构建器调用前，一次在调用期间（第一个对象会被丢弃，所以它后来
可被当作垃圾收掉）。从表面看，这样做似乎效率低下，但它能保证正确的初始化—— 若定义了一个过载的
构建器，它没有初始化 t3；同时在 t3 的定义里并没有规定“默认”的初始化方式，那么会产生什么后果
呢
 * @author 唐杰
 *
 */
class Tag{
	
	 Tag(int maker) {
		System.out.println("Tag("+maker+")");
	}
}

class Card{
	Tag t1 = new Tag(1);
	Card(){
		System.out.println("Card()");
		t3 = new Tag(33);
	}
	Tag t2 = new Tag(2);
	void f(){
		System.out.println("f()");
	}
	Tag t3 = new Tag(3);
}
