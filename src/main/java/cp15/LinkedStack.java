package cp15;

/**
 * �������ʹ����һ��ĩ���ڱ������ж϶�ջ��ʱΪ�ա� ���ĩ���ڱ�ʵ�ڹ���LinkedStack�Ǵ����ģ�
 * Ȼ��ÿ����һ��push�������������ǻ᷵��top.item�� Ȼ������ǰtop��ָ�ĵ�Node<T>,����topת�Ƶ���һ��Node<T>,
 * �����Ѿ�������ĩ���ڱ�������Ͳ������ƶ��ˣ� ����Ѿ�����ĩ�ˣ��ͻ��˳��򻹼�������pop()��������ֻ�ܵõ�null, ˵����ջ�Ѿ����ˡ�
 * 
 * @author tangj
 *
 * @param <T>
 */
public class LinkedStack<T> {
	private static class Node<U> {
		U item;
		Node<U> next;

		Node() {
			item = null;
			next = null;
		}

		Node(U item, Node<U> next) {
			this.item = item;
			this.next = next;
		}

		boolean end() {
			return item == null && next == null;
		}
	}

	private Node<T> top = new Node<T>();

	public void push(T item) {
		top = new Node<T>(item, top);
	}

	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}

	public static void main(String args[]) {
		LinkedStack<String> lss = new LinkedStack<String>();
		for (String s : "Phaers on stun!".split(" ")) {
			lss.push(s);
		}
		String s;
		System.out.println(lss.pop());
		while ((s = lss.pop()) != null) {
			System.out.println(s);
		}
	}
}
