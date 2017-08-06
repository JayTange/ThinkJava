package cp4;
/**
 * 含有static情况下 初始化执行顺序 
 * 
 * 1.初始化的顺序是首先 static（如果它们尚未由前一次对象创建过程初始化），接着是非static 对象。大家
可从输出结果中找到相应的证据。

 * @author 唐杰
 *
 */
/**
 * 
 * 对象创建过程
 * (1) 类型为 Dog 的一个对象首次创建时，或者 Dog 类的 static 方法／ static 字段首次访问时， Java 解释器
必须找到 Dog.class（在事先设好的类路径里搜索）。
(2) 找到 Dog.class 后（它会创建一个 Class 对象，这将在后面学到），它的所有 static 初始化模块都会运
行。因此， static 初始化仅发生一次—— 在 Class 对象首次载入的时候。
(3) 创建一个 new Dog()时， Dog 对象的构建进程首先会在内存堆（ Heap）里为一个 Dog 对象分配足够多的存
储空间。
(4) 这种存储空间会清为零，将 Dog 中的所有基本类型设为它们的默认值（零用于数字，以及 boolean 和
char 的等价设定）。
(5) 进行字段定义时发生的所有初始化都会执行。
(6) 执行构建器。正如第 6 章将要讲到的那样，这实际可能要求进行相当多的操作，特别是在涉及继承的时
候。
 * @author 唐杰
 *
 */
public class StaticInitialization {

	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		t2.f2(1);
		t3.f3(1);
	}
	static Table t2 = new Table();
	static Cupboard t3 = new Cupboard();
}
class Bowl{
	public Bowl(int maker) {
		System.out.println("Bowl("+maker+")");
	}
	void f(int maker){
		System.out.println("f("+maker+")");
	}
}
class Table{
	static Bowl b1 = new Bowl(1);
	public Table() {
		System.out.println("Table()");
		b2.f(1);
	}
	void f2(int maker){
		System.out.println("f2("+maker+")");
	}
	static Bowl b2 = new Bowl(2);
}
class Cupboard{
	Bowl b3 = new Bowl(3);
	static Bowl b4 = new Bowl(4);
	public Cupboard() {
		System.out.println("Cupboard()");
		b4.f(2);
	}
	void f3(int maker){
		System.out.println("f3("+maker+")");
	}
	static Bowl b5 = new Bowl(5);
}

