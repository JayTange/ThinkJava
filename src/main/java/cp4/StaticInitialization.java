package cp4;
/**
 * ����static����� ��ʼ��ִ��˳�� 
 * 
 * 1.��ʼ����˳�������� static�����������δ��ǰһ�ζ��󴴽����̳�ʼ�����������Ƿ�static ���󡣴��
�ɴ����������ҵ���Ӧ��֤�ݡ�

 * @author �ƽ�
 *
 */
/**
 * 
 * ���󴴽�����
 * (1) ����Ϊ Dog ��һ�������״δ���ʱ������ Dog ��� static ������ static �ֶ��״η���ʱ�� Java ������
�����ҵ� Dog.class����������õ���·������������
(2) �ҵ� Dog.class �����ᴴ��һ�� Class �����⽫�ں���ѧ�������������� static ��ʼ��ģ�鶼����
�С���ˣ� static ��ʼ��������һ�Ρ��� �� Class �����״������ʱ��
(3) ����һ�� new Dog()ʱ�� Dog ����Ĺ����������Ȼ����ڴ�ѣ� Heap����Ϊһ�� Dog ��������㹻��Ĵ�
���ռ䡣
(4) ���ִ洢�ռ����Ϊ�㣬�� Dog �е����л���������Ϊ���ǵ�Ĭ��ֵ�����������֣��Լ� boolean ��
char �ĵȼ��趨����
(5) �����ֶζ���ʱ���������г�ʼ������ִ�С�
(6) ִ�й������������ 6 �½�Ҫ��������������ʵ�ʿ���Ҫ������൱��Ĳ������ر������漰�̳е�ʱ
��
 * @author �ƽ�
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

