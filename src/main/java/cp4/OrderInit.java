package cp4;
/**
 * ����������˳��
 * @author �ƽ�
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
 * ��ˣ� t3 ����ᱻ��ʼ�����Σ�һ���ڹ���������ǰ��һ���ڵ����ڼ䣨��һ������ᱻ����������������
�ɱ����������յ������ӱ��濴���������ƺ�Ч�ʵ��£������ܱ�֤��ȷ�ĳ�ʼ������ ��������һ�����ص�
����������û�г�ʼ�� t3��ͬʱ�� t3 �Ķ����ﲢû�й涨��Ĭ�ϡ��ĳ�ʼ����ʽ����ô�����ʲô���
��
 * @author �ƽ�
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
