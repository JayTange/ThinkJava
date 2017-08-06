package cp4;

/**
 * 测试变量初始化的值
 * 
 * @author 唐杰
 *
 */
public class Init {

	public static void main(String[] args) {
		Measurement m = new Measurement();
		m.print();
	}

}

class Measurement {
	boolean t=true;
	char c='x';
	short s=0xff;
	byte b=47;
	int i=100;
	long l=10000;
	float f=0.1f;
	double d=9.10;

	void print(){
		System.out.println(
				"Data type Inital value\n" +
						"boolean " + t + "\n" +
						"char " + c + "\n" +
						"byte " + b + "\n" +
						"short " + s + "\n" +
						"int " + i + "\n" +
						"long " + l + "\n" +
						"float " + f + "\n" +
						"double " + d
				);
	}
}